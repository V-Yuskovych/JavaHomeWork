package com.pb.yuskovych.hw11and12;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;


public class PhoneBook {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        List<Person> phoneBooks = new ArrayList<>();

        ObjectMapper mappers = new ObjectMapper();
        mappers.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule modules = new SimpleModule();
        modules.addSerializer(LocalDate.class, new LocalDateSerializer());
        modules.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mappers.registerModule(modules);


        System.out.println("~~~~~~~~~~~~Добро пожаловать в телефонную книгу!~~~~~~~~~~~~");
        System.out.println("Выбирите действие из списка:\n" +
                "1 - Добавить новый контакт\n" +
                "2 - Удалить контакт\n" +
                "3 - Поиск контакта\n" +
                "4 - Сортировка контактов\n" +
                "5 - Изменить контакт\n" +
                "6 - Сохранить телефонную книгу\n" +
                "7 - Импортировать телефонную книгу\n" +
                "0 - Выход из приложения");

        File file = new File("./src/com/pb/yuskovych/test/persons.json");

        int input = 1000;
        while (!(input == 0)) {
            input = in.nextInt();
            switch (input) {
                case 1:
                    addContact(phoneBooks);
                    break;
                case 2:
                    deleteContact(phoneBooks);
                    break;
                case 3:
                    searchContact(phoneBooks);
                    break;
                case 4:
                    printCollection(phoneBooks);
                    break;
                case 5:
                    editNumberCollection(phoneBooks);
                    break;
                case 6:
                    mappers.writeValue(new File(String.valueOf(file)), phoneBooks);
                    System.out.println("Данные успешно сохранены в файл");
                    break;
                case 7:
                    System.out.println("Импортированный файл: ");
                    mappers.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    File file1 = Paths.get("./src/com/pb/yuskovych/test/persons.json").toFile();

                    List<Person> personsImport = Arrays.asList(mappers.readValue(file1, Person[].class));
                    personsImport.forEach(System.out::println);
                    phoneBooks.addAll(personsImport);
                    break;
                case 0:
                    System.out.println("Выход из телефонной книги. Всего доброго!");
                    break;
            }
        }
    }

    //метод для case 1 (Добавить новый контакт)
    private static void addContact(List<Person> list) {
        String fio;
        int[] phones;
        String address;
        LocalDate dateBirthday;
        String timeStamp;

        String start = in.nextLine();

        System.out.println("Введите ФИО: ");
        fio = in.nextLine();

        System.out.println("Введите дату рождения (в формате дд.мм.гггг): ");
        dateBirthday = LocalDate.parse(in.nextLine().replaceAll("[^\\d.]", ""), DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Введите номера телефонов, через запятую: ");
        phones = Arrays.stream(in.nextLine().replaceAll("[^\\d,]", "").split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Введите адрес: ");
        address = in.nextLine();

        timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("ФИО: " + fio + "," + " Дата Рождения: " + dateBirthday + "," + " Номер(а): " + Arrays.toString(phones) + "," + " Адрес: " + address + "," + " Время редактирования: " + timeStamp);
        list.add(new Person(fio, dateBirthday, phones, address, timeStamp));
        System.out.println("Контакт добавлен.");
    }

    //метод для case 2 (Удалить контакт)
    private static void deleteContact(List<Person> phoneBooks) {
        System.out.println("Выберите элемент(начиная с 0), который необходимо удалить: ");
        System.out.println(phoneBooks);

        int element = in.nextInt();
        try {
            phoneBooks.remove(element);
            System.out.println("Элемент под номером " + element + " успешно удален.");
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Элемент не обнаружен.");
        }
    }

    //метод для case 3 (Поиск контакта)
    private static void searchContact(List<Person> phoneBooks) {
        int j = 0;
        System.out.println("Введите текст, который ищете:");
        String text = in.nextLine();
        for (int i = 0; i < phoneBooks.size(); i++) {
            String massString = phoneBooks.get(i).getName() + " " +
                    phoneBooks.get(i).getDateBirthday() + " " +
                    Arrays.toString(phoneBooks.get(i).getPhone()) + " " +
                    phoneBooks.get(i).getAddress() + " " +
                    phoneBooks.get(i).getDateEdit();
            if (massString.contains(text)) {
                System.out.println("Был знайден элемент в массиве. В элементе: " + i);
                System.out.println(massString);
                j++;
            }
        }
        if (j == 0) System.out.println("Совпадений не найдено ");
    }

    //метод для case 4 (Сортировка контактов)
    private static void printCollection(List<Person> phoneBooks) {
        int index;
        System.out.println("Сортировка по:");
        System.out.println(" \"1\" - По ФИО");
        System.out.println(" \"2\" - По дате рождения");
        System.out.println(" \"3\" - По ФИО и дате рождения");
        System.out.println(" \"4\" - По номерам телефонов");
        System.out.println(" \"5\" - По адресам");
        String starter = in.nextLine();
        index = Integer.parseInt(in.nextLine());
        sortCollection(index, phoneBooks);
    }

    private static void sortCollection(int index, List<Person> phoneBooks) {
        switch (index) {
            case 1:
                phoneBooks.sort((a, b) -> a.getName().compareTo(b.getName()));
                System.out.println(phoneBooks);
                break;
            case 2:
                phoneBooks.sort((a, b) -> a.getDateBirthday().compareTo(b.getDateBirthday()));
                System.out.println(phoneBooks);
                break;
            case 3:
                phoneBooks.sort((a, b) -> a.getDateBirthday().compareTo(b.getDateBirthday()));
                phoneBooks.sort((a, b) -> a.getName().compareTo(b.getName()));
                System.out.println(phoneBooks);
                break;
            case 4:
                phoneBooks.sort((a, b) -> a.getPhone().length - b.getPhone().length);
                System.out.println(phoneBooks);
                break;
            case 5:
                phoneBooks.sort((a, b) -> a.getAddress().compareTo(b.getAddress()));
                System.out.println(phoneBooks);
                break;
        }
    }

    //метод для case 5 (Изменить контакт)
    private static void editNumberCollection(List<Person> phoneBooks) {
        String line;
        String line1;
        int[] phones;
        int input;
        try {
            System.out.println("Для редактирования, укажите строку (начиная с 0):");
            phoneBooks.stream().forEach(System.out::println);
            input = Integer.parseInt(in.nextLine());
            System.out.println("Выберите, какое поле редактируем:");
            System.out.println("1 - ФИО:\n2 - дата рождения(формат: yyyy-MM-dd)");
            System.out.println("3 - номера телефонов:\n4 - адресс");
            line = in.nextLine();
            System.out.println("Вы выбрали строку: " + input + "\nВы выбрали поле: " + line + ". Введите значение для замены:");
            line1 = in.nextLine();

            switch (Integer.parseInt(line)) {
                case 1:
                    phoneBooks.get(input).setName(line1);
                    replaced(input, phoneBooks);
                    break;
                case 2:
                    phoneBooks.get(input).setDateBirthday(LocalDate.parse(line1.replaceAll("[^\\d-]", ""), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    replaced(input, phoneBooks);
                    break;
                case 3:
                    phones = Arrays.stream(line1.replaceAll("[^\\d,]", "").split(","))
                            .mapToInt(Integer::parseInt).toArray();
                    phoneBooks.get(input).setPhone(phones);
                    replaced(input, phoneBooks);
                    break;
                case 4:
                    phoneBooks.get(input).setAddress(line1);
                    replaced(input, phoneBooks);
                    break;
            }
        } catch (DateTimeParseException e) {
            System.out.println("Вы указали неверные данные при вводе даты, повторите все сначала");
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Вы ввели неверное значение, повторите попытку");
        }
    }

    private static void replaced(int editNumCollection, List<Person> phoneBooks) {
        phoneBooks.get(editNumCollection).setDateEdit(new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime()));
        System.out.println("Данные успешно изменены.");
    }
}