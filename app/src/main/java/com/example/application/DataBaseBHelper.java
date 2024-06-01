package com.example.application;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseBHelper extends SQLiteOpenHelper {
    private static DataBaseBHelper instance;
    // Data base
    private static final String DB_Name = "my_data_base.db";
    private static final int DB_Version = 1;

    // Table users
    public static final String TableUsers = "users";
    // Table field for users
    public static final String Id = "id";
    public static final String Login = "login";
    public static final String Password = "password";
    public static final String Email = "email";

    // Table words
    public static final String TableWords = "words";
    // Table field for words
    public static final String WordId = "id";
    public static final String WordAlt = "alt";
    public static final String WordRus = "rus";
    public static final String WordSoundOnRus = "sound";
    public static final String WordSoundOnAlt = "sound1";
    public static final String WordImage = "image";
    public static final String WordAnalogs = "analogs";

    // Table tests
    public static final String TableTests = "tests";
    public static final String TestId = "id";
    public static final String VariantOne = "variant1";
    public static final String VariantTwo = "variant2";
    public static final String VariantFree = "variant3";
    public static final String VariantFour = "variant4";
    public static final String VariantCorrect = "variantCor";

    // Table wordAnalogs
    public static final String TableWordAnalogs = "wordAnalogs";
    public static final String WordAnalogsId = "id";
    public static final String WordAnalogsAlt = "wordAnalogsAlt";
    public static final String WordAnalogsRus = "wordAnalogRus";
    public static final String WordAnalogsImage = "wordAnalogImage";

    public DataBaseBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DataBaseBHelper(Context context) {
        super(context, DB_Name, null, DB_Version + 53);
    }

    public static DataBaseBHelper getInstance(Context context){
        if (instance == null){
            instance = new DataBaseBHelper(context);
        }

        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Create table users
        sqLiteDatabase.execSQL("CREATE TABLE " + TableUsers + " ("
                + Id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Login + " TEXT, "
                + Password + " TEXT, "
                + Email + " TEXT);");

        // Create table words
        sqLiteDatabase.execSQL("CREATE TABLE " + TableWords + " ("
                + WordId + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WordAlt + " TEXT, "
                + WordRus + " TEXT, "
                + WordSoundOnRus + " TEXT, "
                + WordSoundOnAlt + " TEXT, "
                + WordImage + " TEXT, "
                + WordAnalogs + " TEXT);");

        // Create table tests
        sqLiteDatabase.execSQL("CREATE TABLE " + TableTests + " ("
                + WordId + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + VariantOne + " TEXT, "
                + VariantTwo + " TEXT, "
                + VariantFree + " TEXT, "
                + VariantFour + " TEXT, "
                + VariantCorrect + " TEXT);");

        // Create table wordAnalogs
        sqLiteDatabase.execSQL("CREATE TABLE " + TableWordAnalogs + " ("
                + WordAnalogsId + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WordAnalogsAlt + " TEXT, "
                + WordAnalogsRus + " TEXT, "
                + WordAnalogsImage + " TEXT);");

        // Lesson  # 1                                                                                                                                                      // Lesson  # 1
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Алтай', 'Алтай', 'sound1', 'soundd1', 'image1', 'Тöрöл, Jер, Кырлар, Jараш, Jÿрÿм');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Кысканбазы', 'Бескорыстие', 'sound2', 'soundd2', 'image2', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Амыр-энчÿ jадары', 'Благополучие', 'sound3', 'soundd3', 'image3', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Јуук', 'Близкие', 'sound4', 'soundd4', 'image4', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jуук кижи', 'Близкий человек', 'sound5', 'soundd5', 'image5', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Кудай', 'Бог', 'sound6', 'soundd6', 'image6', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Карындаш', 'Брат', 'sound7', 'soundd7', 'image7', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Бÿдери', 'Вера', 'sound8', 'soundd8', 'image8', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Беринери', 'Верность', 'sound9', 'soundd9', 'image9', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jыргал', 'Веселье', 'sound10', 'soundd10', 'image10', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Салкын', 'Ветер', 'sound11', 'soundd11', 'image11', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Бойы-бойын билижери', 'Взаимопонимание', 'sound12', 'soundd12', 'image12', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jанг', 'Власть', 'sound13', 'soundd13', 'image13', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Суу', 'Вода', 'sound14', 'soundd14', 'image14', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Кей', 'Воздух', 'sound15', 'soundd15', 'image15', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ӧй', 'Время', 'sound16', 'soundd16', 'image16', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Оморкооры', 'Гордость', 'sound17', 'soundd17', 'image17', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Кырлар', 'Горы', 'sound18', 'soundd18', 'image18', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Акча', 'Деньги', 'sound19', 'soundd19', 'image19', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Деремне', 'Деревня', 'sound20', 'soundd20', 'image20', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Агаш', 'Дерево', 'sound21', 'soundd21', 'image21', '');");

        // Lesson # 2                                                                                                                                                       // Lesson  # 2
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Балдар', 'Дети', 'sound22', 'soundd22', 'image22', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Бала тужы', 'Детство', 'sound23', 'soundd23', 'image23', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Диплом', 'Диплом', 'sound24', 'soundd24', 'image24', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Иженчи', 'Доверие', 'sound25', 'soundd25', 'image25', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Молjу', 'Долг', 'sound26', 'soundd26', 'image26', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Тура', 'Дом', 'sound27', 'soundd27', 'image27', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Кыс', 'Дочь', 'sound28', 'soundd28', 'image28', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Наjылык', 'Дружба', 'sound29', 'soundd29', 'image29', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Наjылар', 'Друзья', 'sound30', 'soundd30', 'image30', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jÿрÿм', 'Жизнь', 'sound31', 'soundd31', 'image31', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jылдыстар', 'Звезды', 'sound32', 'soundd32', 'image32', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Су-кадык', 'Здоровье', 'sound33', 'soundd33', 'image33', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jер', 'Земля', 'sound34', 'soundd34', 'image34', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Билик', 'Знание', 'sound35', 'soundd35', 'image35', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Искусство', 'Искусство', 'sound36', 'soundd36', 'image36', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Таш', 'Камень', 'sound37', 'soundd37', 'image37', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Мöш', 'Кедр', 'sound38', 'soundd38', 'image38', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Бичиктер', 'Книги', 'sound39', 'soundd39', 'image39', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Аттар', 'Кони', 'sound40', 'soundd42', 'image40', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Оду', 'Костер', 'sound41', 'soundd41', 'image41', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jаражы', 'Красота', 'sound42', 'soundd42', 'image42', '');");

        // Lesson # 3                                                                                                                                                       // Lesson  # 3
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Культура', 'Культура', 'sound43', 'soundd43', 'image43', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Агаштар', 'Лес', 'sound44', 'soundd44', 'image44', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Литература', 'Литература', 'sound45', 'soundd45', 'image45', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Сÿÿген', 'Любимый', 'sound46', 'soundd46', 'image46', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Сÿÿген кижи', 'Любимый человек', 'sound47', 'soundd47', 'image47', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Сÿÿш', 'Любовь', 'sound48', 'soundd48', 'image48', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Эне', 'Мать', 'sound49', 'soundd49', 'image49', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Машина', 'Машина', 'sound50', 'soundd50', 'image50', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jер-телекей', 'Мир', 'sound51', 'soundd51', 'image51', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ӧбöгöни', 'Муж', 'sound52', 'soundd52', 'image52', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Музыка', 'Музыка', 'sound53', 'soundd53', 'image53', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ижениш', 'Надежда', 'sound54', 'soundd54', 'image54', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Албаты', 'Народ', 'sound55', 'soundd55', 'image55', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Тенери', 'Небо', 'sound56', 'soundd56', 'image56', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Камаан jогы', 'Независимость', 'sound57', 'soundd57', 'image57', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Тÿн', 'Ночь', 'sound58', 'soundd58', 'image58', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Аргалу jатканы', 'Обеспеченность', 'sound59', 'soundd59', 'image59', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Булуттар', 'Облака', 'sound60', 'soundd60', 'image60', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Билери', 'Образование', 'sound61', 'soundd61', 'image61', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Билижери', 'Общение', 'sound62', 'soundd62', 'image62', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('От', 'Огонь', 'sound63', 'soundd63', 'image63', '');");

        // Lesson # 4                                                                                                                                                       // Lesson  # 4
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Амыр', 'Отдых', 'sound64', 'soundd64', 'image64', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ада', 'Отец', 'sound65', 'soundd65', 'image65', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Очок', 'Очаг', 'sound66', 'soundd66', 'image66', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Кÿннин аайы', 'Погода', 'sound67', 'soundd67', 'image67', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Амыр', 'Покой', 'sound68', 'soundd68', 'image68', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jалан', 'Поле', 'sound69', 'soundd69', 'image69', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Болуш', 'Помощь', 'sound70', 'soundd70', 'image70', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ондооры', 'Понимание', 'sound71', 'soundd71', 'image71', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Чын', 'Правда', 'sound72', 'soundd72', 'image72', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ар-бyткен', 'Природа', 'sound73', 'soundd73', 'image73', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Куштар', 'Птицы', 'sound74', 'soundd74', 'image74', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Иш', 'Работа', 'sound75', 'soundd75', 'image75', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Сÿÿнуш', 'Радость', 'sound76', 'soundd76', 'image76', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Бала', 'Ребенок', 'sound77', 'soundd77', 'image77', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Агын суу', 'Река', 'sound78', 'soundd78', 'image78', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Сööк', 'Род', 'sound79', 'soundd79', 'image79', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Тöрöл', 'Родина', 'sound80', 'soundd80', 'image80', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ада-эне', 'Родители', 'sound81', 'soundd81', 'image91', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Тöрööндöр', 'Родственники', 'sound82', 'soundd82', 'image82', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jайым', 'Свобода', 'sound83', 'soundd83', 'image83', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Биле', 'Семья', 'sound84', 'soundd84', 'image84', '');");

        // Lesson # 5                                                                                                                                                       // Lesson  # 5
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jÿрек', 'Сердце', 'sound85', 'soundd85', 'image85', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Сыйын', 'Сестра', 'sound86', 'soundd86', 'image86', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ийт', 'Собака', 'sound87', 'soundd87', 'image87', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Уйат', 'Совесть', 'sound88', 'soundd88', 'image88', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Кÿн', 'Солнце', 'sound89', 'soundd89', 'image89', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Чындык', 'Справедливость', 'sound90', 'soundd90', 'image90', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Чöл', 'Степь', 'sound91', 'soundd91', 'image91', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Турумкайы', 'Стойкость', 'sound92', 'soundd92', 'image92', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Салым', 'Судьба', 'sound93', 'soundd93', 'image93', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ырыс кöрöри', 'Счастье', 'sound94', 'soundd94', 'image94', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Уул', 'Сын', 'sound95', 'soundd95', 'image95', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ӳÿр', 'Табун', 'sound96', 'soundd96', 'image96', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Университет', 'Университет', 'sound97', 'soundd97', 'image97', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Jенÿ', 'Успех', 'sound98', 'soundd98', 'image98', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ӳредÿ', 'Учеба', 'sound99', 'soundd99', 'image99', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ӳредÿчи', 'Учитель', 'sound100', 'soundd100', 'image100', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Чечектер', 'Цветы', 'sound101', 'soundd101', 'image101', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ак-чек', 'Честность', 'sound102', 'soundd102', 'image102', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Ару', 'Чистота', 'sound103', 'soundd103', 'image103', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Школ', 'Школа', 'sound104', 'soundd104', 'image104', '');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + "," + WordAnalogs + ") VALUES ('Тил', 'Язык', 'sound105', 'soundd105', 'image105', '');");

        // Test # 1                                                                                                                                                             // Test # 1
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Алтай', 'Алтой', 'Алjай', 'Олтай', 'Алтай');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Бесорыстие', 'Бескорыстие', 'Быскрыöстие', 'Бескöрыстие', 'Бескорыстие');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Благöполучие', 'Благопачье', 'Благополучие', 'Бескорыстие', 'Благополучие');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Блиские', 'Блiзкие', 'Близкиÿ', 'Близкие', 'Близкие');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Близкий человек', 'Блiский человек', 'Блiзкий человек', 'Близкий челöвек', 'Близкий человек');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Айна', 'Бог', 'Эрлик', 'Бöг', 'Бог');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Карандаш', 'Брÿт', 'Брат', 'Брот', 'Брат');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Вjра', 'Вира', 'Вяря', 'Вера', 'Вера');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Верность', 'Вергность', 'Вернöсть', 'Верость', 'Верность');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Селье', 'Веселье', 'Весjеже', 'Ревность', 'Веселье');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Ветiр', 'Вiтiр', 'Ветер', 'Ветарe', 'Ветер');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Взаимöпонимание', 'Взаимöпöнимание', 'Взаiмопонимание', 'Взаимопонимание', 'Взаимопонимание');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Власть', 'Влость', 'Власт', 'Власте', 'Власть');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Кег', 'Вода', 'Водja', 'Вöда', 'Вода');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Саа', 'Сыы', 'Воздух', 'Вöздух', 'Воздух');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Врем', 'Ый', 'Врÿмя', 'Время', 'Время');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Гордость', 'Гöрдость', 'Гардость', 'Гордыность', 'Гордость');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Гöрi', 'Горы', 'Гöры', 'Гöре', 'Горы');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Акша', 'Денги', 'Деньги', 'Деннги', 'Деньги');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дермня', 'Деровна', 'Дерення', 'Деревня', 'Деревня');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дерево', 'Атош', 'Аган', 'Дерiво', 'Дерево');");

        // Test # 2                                                                                                                                                              // Test # 2
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дети', 'Доти', 'Дотi', 'Дiтя', 'Дети');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дество', 'Детство', 'Девствö', 'Детства', 'Детство');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дiплом', 'Диплöм', 'Диплом', 'Дiплöм', 'Диплом');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Доверjе', 'Доварие', 'Дöварье', 'Доверие', 'Доверие');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Долг', 'Дол', 'До', 'Дон', 'Долг');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дöм', 'Дом', 'Дос', 'Доо', 'Дом');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дочъ', 'Доч', 'Дочь', 'Дöчь', 'Дочь');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Дрыжба', 'Доужба', 'Дрÿжба', 'Дружба', 'Дружба');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Друзья', 'Друзь', 'Други', 'Дружба', 'Друзья');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Жiзнь', 'Жизнь', 'Жизне', 'Жизну', 'Жизнь');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Звезди', 'Здвезы', 'Звезды', 'Звызды', 'Звезды');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Здöровие', 'Здöровье', 'Здорöвье', 'Здоровье', 'Здоровье');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Земля', 'Земе', 'Земелы', 'Зымылу', 'Земля');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Знанiние', 'Знание', 'Знанние', 'Знаннiе', 'Знание');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Искÿсство', 'Искысство', 'Искусство', 'Исс', 'Искусство');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Камен', 'Камjен', 'Камjин', 'Камень', 'Камень');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Кедр', 'Кад', 'Кед', 'Кыдр', 'Кедр');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Кнiга', 'Книги', 'Книгы', 'Кингу', 'Книги');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Каш', 'Конни', 'Кони', 'Кöни', 'Кони');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Кöстер', 'Костиръ', 'Кöстыр', 'Костер', 'Костер');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Красота', 'Красу', 'Красöту', 'Красöта', 'Красота');");

        // Test # 3                                                                                                                                                             // Test # 3
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Культура', 'Кöлтура', 'Кöльтура', 'Кÿльтÿра', 'Культура');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Лисс', 'Лес', 'Лiс', 'Лiсс', 'Лес');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Лiтература', 'Литератÿра', 'Литература', 'Лiтератÿрыы', 'Литература');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Лÿбимый', 'Лÿбiмый', 'Любiмыы', 'Любимый', 'Любимый');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Любимый человек', 'Лÿбимый кижи', 'Лÿбiмый кижи', 'Любiмуу кижи', 'Любимый человек');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Любöв', 'Любовь', 'Любöвь', 'Луубöвь', 'Любовь');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Мат', 'Муу', 'Мать', 'Мыыы', 'Мать');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Машiа', 'Машiна', 'Маш', 'Машина', 'Машина');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Мир', 'Мiр', 'Мjaр', 'Маш', 'Мир');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Мууж', 'Муж', 'Мыыж', 'Мöж', 'Муж');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Мöзыка', 'Мöзуука', 'Музыка', 'Мöзука', 'Музыка');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Надежди', 'Надежд', 'Надежбы', 'Надежда', 'Надежда');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Народ', 'Нарöд', 'Нароо', 'Нарыы', 'Народ');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Небö', 'Небо', 'Ныбо', 'Нибо', 'Небо');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Незавiсiмость', 'Независимöсть', 'Независимость', 'Незаависiмость', 'Независимость');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Нöч', 'Нöчх', 'Ночх', 'Ночь', 'Ночь');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Обеспеченность', 'Обеспычность', 'Обеспеченнöть', 'Обеспеченнöсть', 'Обеспеченность');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Облык', 'Облака', 'Облакуу', 'Облакыы', 'Облака');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Образöвание', 'Образöванiе', 'Образование', 'Образваныы', 'Образование');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Обращне', 'Обащрение', 'Обраащение', 'Общение', 'Общение');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Огонь', 'Ог', 'Ол', 'Огöн', 'Огонь');");

        //Test # 4                                                                                                                                                              // Test # 4
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Отдых', 'Амы', 'Амып', 'Амыыр', 'Отдых');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Адэ', 'Отец', 'Отэц', 'Отjц', 'Отец');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Окчаг', 'Очааг', 'Очаг', 'Окчуг', 'Очаг');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Пöгöда', 'Пöгода', 'Пöгда', 'Погода', 'Погода');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Покой', 'Пöкой', 'Пöкöй', 'Покоjе', 'Покой');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Пöле', 'Поле', 'Jaлам', 'Jылым', 'Поле');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Пöмощь', 'Балуш', 'Помощь', 'Пöмöщь', 'Помощь');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Пöнимание', 'Понiмание', 'Пöнiманiе', 'Понимание', 'Понимание');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Правда', 'Правдгы', 'Правдге', 'Правдуу', 'Правда');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Прирöда', 'Природа', 'Прiрода', 'Прiрöда', 'Природа');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Птiцы', 'Птыци', 'Птицы', 'Птыцыы', 'Птицы');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Рабöта', 'Рабööта', 'Раабот', 'Работа', 'Работа');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Радость', 'Раадость', 'Радöсть', 'Радöст', 'Радость');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Ребенöк', 'Ребенок', 'Ребьенок', 'Ребынок', 'Ребенок');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Рика', 'Рiка', 'Река', 'Рек', 'Река');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Рöд', 'Рот', 'Рöт', 'Род', 'Род');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Родина', 'Рöдина', 'Родiна', 'Рööдiна', 'Родина');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Родiтели', 'Родители', 'Рöдитель', 'Рöдителуу', 'Родители');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Рöдственники', 'Родственникуу', 'Родственники', 'Рöтсственники', 'Родственники');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Собода', 'Свöбода', 'Свöбöда', 'Свобода', 'Свобода');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Семья', 'Сiмья', 'Сим', 'Суум', 'Семья');");

        // Test # 5                                                                                                                                                             // Test # 5
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Сердце', 'Сер', 'Сырдве', 'Седъце', 'Сердце');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Сестр', 'Сестра', 'Анэ', 'Амыы', 'Сестра');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Сöбака', 'Сöбакы', 'Собака', 'Сöбаыы', 'Собака');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Сöвест', 'Совест', 'Сöвеест', 'Совесть', 'Совесть');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Солнце', 'Сöлнуу', 'Солнуу', 'Солнцуу', 'Солнце');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Справедлiвость', 'Справедливость', 'Справедлiвöсть', 'Справедливöстуу', 'Справедливость');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Степ', 'Стып', 'Степь', 'Степуу', 'Степь');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Стöйкость', 'Стойкусть', 'Стöкусть', 'Стойкость', 'Стойкость');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Судьба', 'Ceдба', 'Суудьба', 'Суудба', 'Судьба');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Счаст', 'Счастье', 'Счастыы', 'Счастуу', 'Счастье');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Сыы', 'Соо', 'Сын', 'Сныы', 'Сын');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Табо', 'Табуу', 'Таюбуу', 'Табун', 'Табун');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Университет', 'Унiверситет', 'Увиверсiтет', 'Универституу', 'Университет');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Ууспех', 'Успех', 'Ыыспух', 'Ыыспех', 'Успех');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Уучебы', 'Уучебуу', 'Учеба', 'Учебö', 'Учеба');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Учiтел', 'Учителье', 'Учiтелыы', 'Учитель', 'Учитель');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Цветы', 'Цветуу', 'Цвööт', 'Цвöööту', 'Цветы');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Честнöсть', 'Честность', 'Честннност', 'Честнöстт', 'Честность');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Чiстоьа', 'Чистотта', 'Чистота', 'Чiстöтыы', 'Чистота');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Шкöл', 'Шкоолу', 'Шкооолы', 'Школа', 'Школа');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableTests + " (" + VariantOne + ", " + VariantTwo + ", " + VariantFree + ", " + VariantFour + "," + VariantCorrect + ") VALUES ('Язык', 'Языык', 'Язуук', 'Язук', 'Язык');");

        // wordAnalogs # 1                                                                                                                            // wordAnalogs # 1
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тöрöл', 'Родина', 'wordimageanalogs1');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jерл', 'Земля', 'wordimageanalogs2');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кырлар', 'Горы', 'wordimageanalogs3');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Карамданбас', 'Жадный', 'wordimageanalogs4');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs5');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Карам эмес', 'Не жадный', 'wordimageanalogs6');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы', 'Хорошо', 'wordimageanalogs7');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы jадар', 'Хорошо жить', 'wordimageanalogs8');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jуу jок', 'Без войны', 'wordimageanalogs9');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs10');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöр', 'Друг', 'wordimageanalogs11');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jанында', 'Рядом', 'wordimageanalogs12');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эне', 'Мать', 'wordimageanalogs13');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тöрööн', 'Родственник', 'wordimageanalogs14');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöр', 'Друг', 'wordimageanalogs15');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jанг', 'Власть', 'wordimageanalogs16');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бÿдер', 'Верить', 'wordimageanalogs17');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тенери', 'Небо', 'wordimageanalogs18');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ийини', 'Младший брат', 'wordimageanalogs19');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöр', 'Друг', 'wordimageanalogs20');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тöрööн', 'Родственник', 'wordimageanalogs21');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Иженер', 'Надеяться', 'wordimageanalogs22');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бÿдер', 'Верить', 'wordimageanalogs23');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бÿтпес', 'Не верить', 'wordimageanalogs24');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ишке', 'На работу', 'wordimageanalogs25');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Иш', 'Работа', 'wordimageanalogs26');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кысканбас', 'Бескорыстие', 'wordimageanalogs27');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Той', 'Пир', 'wordimageanalogs28');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Байрам', 'Праздник', 'wordimageanalogs29');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ойын', 'Игра', 'wordimageanalogs30');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Соок', 'Холодный', 'wordimageanalogs31');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тынг', 'Сильный', 'wordimageanalogs32');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Шуурган', 'Ураган', 'wordimageanalogs33');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Таныш', 'Знакомый', 'wordimageanalogs34');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Таныштар', 'Знакомые', 'wordimageanalogs35');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöрлöр', 'Друзья', 'wordimageanalogs36');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jон', 'Общество', 'wordimageanalogs37');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Алтай', 'Алтайская', 'wordimageanalogs38');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ак', 'Белая', 'wordimageanalogs39');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ару', 'Чистая', 'wordimageanalogs40');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Булут', 'Облако', 'wordimageanalogs41');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Аржан-суу', 'Лечебный источник', 'wordimageanalogs42');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ару', 'Чистый', 'wordimageanalogs43');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Телекей', 'Планета', 'wordimageanalogs44');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Изÿ', 'Жаркий', 'wordimageanalogs45');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Учы jок', 'Бесконечное', 'wordimageanalogs46');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jас', 'Часы', 'wordimageanalogs47');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jÿрÿм', 'Жизнь', 'wordimageanalogs48');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сÿÿнер', 'Радоваться', 'wordimageanalogs49');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Республика', 'Республика', 'wordimageanalogs50');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бала', 'Ребенок', 'wordimageanalogs51');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бийик', 'Высокие', 'wordimageanalogs52');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаан', 'Большие', 'wordimageanalogs53');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кыр', 'Гора', 'wordimageanalogs54');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Чаазын', 'Бумага', 'wordimageanalogs55');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Манат', 'Деньги', 'wordimageanalogs56');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кöп', 'Много', 'wordimageanalogs57');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jурт', 'Село', 'wordimageanalogs58');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаш тужы', 'Детство', 'wordimageanalogs59');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаан', 'Большая', 'wordimageanalogs60');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jажыл', 'Зеленое', 'wordimageanalogs61');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Таш', 'Камень', 'wordimageanalogs62');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кайын', 'Береза', 'wordimageanalogs63');");

        // wordAnalogs # 2                                                                                                                            // wordAnalogs # 2
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Балдардыҥ сады', 'Детский сад', 'wordimageanalogs64');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кöп', 'Много', 'wordimageanalogs65');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кичинек', 'Маленькие', 'wordimageanalogs66');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаш тужы', 'Детство', 'wordimageanalogs67');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ойын', 'Игра', 'wordimageanalogs68');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кичинек', 'Маленький', 'wordimageanalogs69');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кызыл', 'Красный', 'wordimageanalogs70');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿредÿ', 'Учеба', 'wordimageanalogs71');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Чаазын', 'Бумага', 'wordimageanalogs72');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кудай', 'Бог', 'wordimageanalogs73');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кычырар', 'Читать', 'wordimageanalogs74');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Билгир', 'Знание', 'wordimageanalogs75');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кирлÿ', 'Грязный', 'wordimageanalogs76');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöрлöр', 'Друзья', 'wordimageanalogs77');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кудайга', 'В бога', 'wordimageanalogs78');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Айыл', 'Дом', 'wordimageanalogs79');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Биле', 'Семья', 'wordimageanalogs80');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jылу', 'Тепло', 'wordimageanalogs81');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бала', 'Ребенок', 'wordimageanalogs82');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивая', 'wordimageanalogs83');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Уул', 'Сын', 'wordimageanalogs84');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöр', 'Друг', 'wordimageanalogs85');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöрлöр', 'Друзья', 'wordimageanalogs86');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бек', 'Крепкая', 'wordimageanalogs87');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöрлöр', 'Друзья', 'wordimageanalogs88');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Улус', 'Люди', 'wordimageanalogs89');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы', 'Хорошие', 'wordimageanalogs90');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивая', 'wordimageanalogs91');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Салым', 'Судьба', 'wordimageanalogs92');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кÿч', 'Тяжело', 'wordimageanalogs93');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Теҥери', 'Небо', 'wordimageanalogs94');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тÿн', 'Ночь', 'wordimageanalogs95');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ай', 'Луна', 'wordimageanalogs96');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бек', 'Крепкое', 'wordimageanalogs97');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы', 'Хорошее', 'wordimageanalogs98');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кÿн', 'Солнце', 'wordimageanalogs99');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Телекей', 'Планета', 'wordimageanalogs100');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тобрак', 'Почва', 'wordimageanalogs101');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кара ', 'Черная', 'wordimageanalogs102');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бичик', 'Книга', 'wordimageanalogs103');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бек', 'Крепкое', 'wordimageanalogs104');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jер', 'Земля', 'wordimageanalogs105');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jурук', 'Рисунок', 'wordimageanalogs106');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивое', 'wordimageanalogs107');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jуруктар', 'Рисунки', 'wordimageanalogs108');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кату', 'Твердый', 'wordimageanalogs109');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаан', 'Большой', 'wordimageanalogs110');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кыр', 'Гора', 'wordimageanalogs11');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Агаш', 'Дерево', 'wordimageanalogs112');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кузук', 'Орех', 'wordimageanalogs113');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кузуктар', 'Орехи', 'wordimageanalogs114');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Библиотека', 'Библиотека', 'wordimageanalogs115');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Каткы', 'Громкий смех', 'wordimageanalogs116');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿредÿ', 'Учеба', 'wordimageanalogs117');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Мал', 'Скот', 'wordimageanalogs118');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивые', 'wordimageanalogs119');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эрjине', 'Драгоценные', 'wordimageanalogs120');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('От', 'Огонь', 'wordimageanalogs121');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Очок', 'Очаг', 'wordimageanalogs122');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ӧлöҥ чабары', 'Покос', 'wordimageanalogs123');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы', 'Хорошо', 'wordimageanalogs124');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кыс', 'Дочь', 'wordimageanalogs125');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивый', 'wordimageanalogs126');");

        // wordAnalogs # 3                                                                                                                            // wordAnalogs # 3
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Клуб', 'Клуб', 'wordimageanalogs127');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jанҥ', 'Обычай', 'wordimageanalogs128');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Байлык', 'Богатство', 'wordimageanalogs129');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Арал', 'Лес по устью реки', 'wordimageanalogs130');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ар-бÿткен', 'Природа', 'wordimageanalogs131');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кöп', 'Много', 'wordimageanalogs132');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бичик', 'Книга', 'wordimageanalogs133');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Алтай', 'Алтайская', 'wordimageanalogs134');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кычырар', 'Читать', 'wordimageanalogs135');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs136');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараткан', 'Полюбил', 'wordimageanalogs137');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараар', 'Нравиться', 'wordimageanalogs138');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сÿÿш', 'Любовь', 'wordimageanalogs139');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараткан', 'Полюбил', 'wordimageanalogs140');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Уул', 'Сын', 'wordimageanalogs141');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы', 'Хорошо', 'wordimageanalogs142');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ырыс', 'Счастье', 'wordimageanalogs143');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ару', 'Чистая', 'wordimageanalogs144');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кару', 'Дорогая', 'wordimageanalogs145');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ада', 'Отец', 'wordimageanalogs146');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jалакай', 'Добрая', 'wordimageanalogs147');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jол', 'Дорога', 'wordimageanalogs148');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Темир', 'Железо', 'wordimageanalogs149');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кööлик', 'Транспорт', 'wordimageanalogs150');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаан', 'Большой', 'wordimageanalogs151');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Планета', 'Планета', 'wordimageanalogs152');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Албаты', 'Народ', 'wordimageanalogs153');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Карган', 'Старый', 'wordimageanalogs154');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эмеген', 'Жена', 'wordimageanalogs155');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эр кижи', 'Мужчина', 'wordimageanalogs156');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кÿÿ', 'Музыка', 'wordimageanalogs157');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кожоҥ', 'Песня', 'wordimageanalogs158');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивая', 'wordimageanalogs159');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('улус', 'Люди', 'wordimageanalogs160');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бÿдер', 'Верить', 'wordimageanalogs161');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сакылта', 'Ожидание', 'wordimageanalogs162');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Улус', 'Люди', 'wordimageanalogs163');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jон', 'Общество', 'wordimageanalogs164');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эл-jон', 'Население', 'wordimageanalogs165');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кöк', 'Синее', 'wordimageanalogs166');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Чаҥкыр', 'Голубое', 'wordimageanalogs167');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Айас', 'Ясное', 'wordimageanalogs168');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jайым', 'Свобода', 'wordimageanalogs169');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бойы алдынаҥ', 'Сам по себе', 'wordimageanalogs170');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs171');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('караҥуй', 'Темная', 'wordimageanalogs172');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ай', 'Луна', 'wordimageanalogs173');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ылдыстар', 'Звезды', 'wordimageanalogs174');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бай', 'Богатый', 'wordimageanalogs175');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Болужар', 'Помогать', 'wordimageanalogs176');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Неде керек jок', 'Ничего не нужно', 'wordimageanalogs177');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Теҥери', 'Небо', 'wordimageanalogs178');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Суу', 'Река', 'wordimageanalogs179');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ак', 'Белые', 'wordimageanalogs180');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('кижи', 'Человек', 'wordimageanalogs181');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿредÿ', 'Учеба', 'wordimageanalogs182');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Таныш', 'Знакомый', 'wordimageanalogs183');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Таныш', 'Знакомый', 'wordimageanalogs184');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jон', 'Общество', 'wordimageanalogs185');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Таныжар', 'Знакомство', 'wordimageanalogs186');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jалбыш', 'Пламя', 'wordimageanalogs187');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jылу', 'Тепло', 'wordimageanalogs188');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Очок', 'Очаг', 'wordimageanalogs189');");

        // wordAnalogs # 4                                                                                                                            // wordAnalogs # 4
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Энчÿ', 'Спокойствие', 'wordimageanalogs190');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Араай', 'Тихий', 'wordimageanalogs191');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эҥир', 'Вечер', 'wordimageanalogs192');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эр кижи', 'Мужчина', 'wordimageanalogs193');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кару', 'Дорогой', 'wordimageanalogs194');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эне', 'Мать', 'wordimageanalogs195');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jылу', 'Тепло', 'wordimageanalogs196');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('От', 'Огонь', 'wordimageanalogs197');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Печке', 'Печь', 'wordimageanalogs198');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jааш', 'Дождь', 'wordimageanalogs199');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Соок', 'Холодная', 'wordimageanalogs200');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы', 'Хорошая', 'wordimageanalogs201');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Энчÿ', 'Спокойствие', 'wordimageanalogs202');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Араай', 'Тихий', 'wordimageanalogs203');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эҥир', 'Вечер', 'wordimageanalogs204');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Чечектер', 'Цветы', 'wordimageanalogs205');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Элбек', 'Простор', 'wordimageanalogs206');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ӧлöҥ', 'Трава', 'wordimageanalogs207');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сураар', 'Просить', 'wordimageanalogs208');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Иш', 'Работа', 'wordimageanalogs209');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Агару', 'Святая', 'wordimageanalogs210');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Аайлаар', 'Понимать', 'wordimageanalogs211');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Билер', 'Знать', 'wordimageanalogs212');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs213');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тöгÿн', 'Обман', 'wordimageanalogs214');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сöс', 'Слово', 'wordimageanalogs215');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Айдар', 'Говорить', 'wordimageanalogs216');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Агаш-таш', 'Природа', 'wordimageanalogs217');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Эл-jон', 'Население', 'wordimageanalogs218');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивая', 'wordimageanalogs219');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Теҥери', 'Небо', 'wordimageanalogs220');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Учат', 'Летят', 'wordimageanalogs221');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кеткин', 'Перелетные', 'wordimageanalogs222');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Иш-тош', 'Работа', 'wordimageanalogs223');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jакшы', 'Хорошая', 'wordimageanalogs224');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿредÿчи', 'Учитель', 'wordimageanalogs225');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Каткы', 'Громкий смех', 'wordimageanalogs226');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ырыс', 'Счастье', 'wordimageanalogs227');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сÿÿнчи', 'Радость', 'wordimageanalogs228');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кичинек', 'Маленький', 'wordimageanalogs229');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Огоош', 'Маленький', 'wordimageanalogs230');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаш', 'Младенец', 'wordimageanalogs231');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ару', 'Чистая', 'wordimageanalogs232');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Аржан-суу', 'Целебный источник', 'wordimageanalogs233');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тÿрген', 'Быстрая', 'wordimageanalogs234');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тодош', 'Название рода', 'wordimageanalogs235');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ук', 'Род', 'wordimageanalogs236');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кыпчак', 'Название рода', 'wordimageanalogs237');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jер', 'Земля', 'wordimageanalogs238');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Алтай', 'Алтай', 'wordimageanalogs239');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jерим', 'Моя земля', 'wordimageanalogs240');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Биле', 'Семья', 'wordimageanalogs241');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jуук улус', 'Близкие люди', 'wordimageanalogs242');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кару', 'Родные', 'wordimageanalogs243');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jуук улус', 'Близкие люди', 'wordimageanalogs244');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кöп', 'Много', 'wordimageanalogs245');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jуук', 'Близкие', 'wordimageanalogs246');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jÿрÿм', 'Жизнь', 'wordimageanalogs247');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Куш', 'Птица', 'wordimageanalogs248');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тайга', 'Тайга', 'wordimageanalogs249');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ада-эне', 'Родители', 'wordimageanalogs250');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нак', 'Дружная', 'wordimageanalogs251');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаан', 'Большая', 'wordimageanalogs252');");

        // wordAnalogs # 5                                                                                                                            // wordAnalogs # 5
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сÿÿш', 'Любовь', 'wordimageanalogs253');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jÿрÿм', 'Жизнь', 'wordimageanalogs254');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jымжак', 'Мягкое', 'wordimageanalogs255');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кичинек', 'Маленькая', 'wordimageanalogs256');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кару', 'Дорогая', 'wordimageanalogs257');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Карындаш', 'Брат', 'wordimageanalogs258');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кöкöр', 'Друг', 'wordimageanalogs259');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тынду', 'Животное', 'wordimageanalogs260');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Тудан', 'Злая', 'wordimageanalogs261');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаман', 'Плохо', 'wordimageanalogs262');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jок', 'Нет', 'wordimageanalogs263');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кызарар', 'Краснеть', 'wordimageanalogs264');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jарык', 'Яркое', 'wordimageanalogs265');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Изÿ', 'Жара', 'wordimageanalogs266');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ай', 'Луна', 'wordimageanalogs267');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Нöкöр', 'Друг', 'wordimageanalogs268');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs269');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сöс', 'Слово', 'wordimageanalogs270');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jалаҥ', 'Поле', 'wordimageanalogs271');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кумак', 'Песок', 'wordimageanalogs272');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Элбек', 'Широкая', 'wordimageanalogs273');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs274');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Чыдамкай', 'Стойкий', 'wordimageanalogs275');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Чыдажар', 'Терпеть', 'wordimageanalogs276');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jÿрÿм', 'Жизнь', 'wordimageanalogs277');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Конок', 'Рок', 'wordimageanalogs278');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ырысту', 'Счастливая', 'wordimageanalogs279');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сÿÿнчи', 'Радость', 'wordimageanalogs280');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Наjылык', 'Дружба', 'wordimageanalogs281');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сÿÿнер', 'Радоваться', 'wordimageanalogs282');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бала', 'Ребенок', 'wordimageanalogs283');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивый', 'wordimageanalogs284');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Уулчак', 'Мальчик', 'wordimageanalogs285');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Мал', 'Скот', 'wordimageanalogs286');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кой', 'Овца', 'wordimageanalogs287');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Койлор', 'Овцы', 'wordimageanalogs288');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿредÿ', 'Учеба', 'wordimageanalogs289');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бийик ÿредÿ', 'Высшее образование', 'wordimageanalogs290');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿренер jер ', 'Место работы', 'wordimageanalogs291');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Сÿÿнчи', 'Радость', 'wordimageanalogs292');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jуу', 'Война', 'wordimageanalogs293');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Алар', 'Победитель', 'wordimageanalogs294');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Школ', 'Школа', 'wordimageanalogs295');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бийик', 'Высшее', 'wordimageanalogs296');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Бичик', 'Книга', 'wordimageanalogs297');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Качы', 'Учитель', 'wordimageanalogs298');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs299');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Школ', 'Школа', 'wordimageanalogs300');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jараш', 'Красивые', 'wordimageanalogs301');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jалаҥ', 'Поле', 'wordimageanalogs302');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jай', 'Лето', 'wordimageanalogs303');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ару', 'Чистый', 'wordimageanalogs304');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Кижи', 'Человек', 'wordimageanalogs305');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ару-чек', 'Аккуратный', 'wordimageanalogs306');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('кей', 'Воздух', 'wordimageanalogs307');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jалаҥ', 'Поле', 'wordimageanalogs308');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('суу', 'Река', 'wordimageanalogs309');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿредÿ', 'Учеба', 'wordimageanalogs310');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ÿредÿчи', 'Учитель', 'wordimageanalogs311');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Jаан', 'Большая', 'wordimageanalogs312');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Алтай', 'Алтайский', 'wordimageanalogs313');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Куучын', 'Рассказ', 'wordimageanalogs314');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWordAnalogs + " (" + WordAnalogsAlt + ", " + WordAnalogsRus + "," + WordAnalogsImage + ") VALUES ('Ос', 'Рот', 'wordimageanalogs315');");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableUsers);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableWords);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableTests);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableWordAnalogs);
        onCreate(sqLiteDatabase);
    }
}
