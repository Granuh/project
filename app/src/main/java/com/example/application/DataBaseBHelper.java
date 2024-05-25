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

    // Table tests
    public static final String TableTests = "tests";
    public static final String TestId = "id";
    public static final String VariantOne = "variant1";
    public static final String VariantTwo = "variant2";
    public static final String VariantFree = "variant3";
    public static final String VariantFour = "variant4";
    public static final String VariantCorrect = "variantCor";

    public DataBaseBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DataBaseBHelper(Context context) {
        super(context, DB_Name, null, DB_Version + 37);
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
                + WordImage + " TEXT);");

        // Create table tests
        sqLiteDatabase.execSQL("CREATE TABLE " + TableTests + " ("
                + Id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + VariantOne + " TEXT, "
                + VariantTwo + " TEXT, "
                + VariantFree + " TEXT, "
                + VariantFour + " TEXT, "
                + VariantCorrect + " TEXT);");

        // Lesson  # 1                                                                                                                                                      // Lesson  # 1
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Алтай', 'Алтай', 'sound1', 'soundd1', 'image1');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Кысканбазы', 'Бескорыстие', 'sound2', 'soundd2', 'image2');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Амыр-энчÿ jадары', 'Благополучие', 'sound3', 'soundd3', 'image3');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Јуук', 'Близкие', 'sound4', 'soundd4', 'image4');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jуук кижи', 'Близкий человек', 'sound5', 'soundd5', 'image5');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Кудай', 'Бог', 'sound6', 'soundd6', 'image6');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Карындаш', 'Брат', 'sound7', 'soundd7', 'image7');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Бÿдери', 'Вера', 'sound8', 'soundd8', 'image8');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Беринери', 'Верность', 'sound9', 'soundd9', 'image9');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jыргал', 'Веселье', 'sound10', 'soundd10', 'image10');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Салкын', 'Ветер', 'sound11', 'soundd11', 'image11');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Бойы-бойын билижери', 'Взаимопонимание', 'sound12', 'soundd12', 'image12');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jанг', 'Власть', 'sound13', 'soundd13', 'image13');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Суу', 'Вода', 'sound14', 'soundd14', 'image14');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Кей', 'Воздух', 'sound15', 'soundd15', 'image15');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ӧй', 'Время', 'sound16', 'soundd16', 'image16');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Оморкооры', 'Гордость', 'sound17', 'soundd17', 'image17');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Кырлар', 'Горы', 'sound18', 'soundd18', 'image18');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Акча', 'Деньги', 'sound19', 'soundd19', 'image19');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Деремне', 'Деревня', 'sound20', 'soundd20', 'image20');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Агаш', 'Дерево', 'sound21', 'soundd21', 'image21');");

        // Lesson # 2                                                                                                                                                       // Lesson  # 2
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Балдар', 'Дети', 'sound22', 'soundd22', 'image22');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Бала тужы', 'Детство', 'sound23', 'soundd23', 'image23');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Диплом', 'Диплом', 'sound24', 'soundd24', 'image24');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Иженчи', 'Доверие', 'sound25', 'soundd25', 'image25');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Молjу', 'Долг', 'sound26', 'soundd26', 'image26');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Тура', 'Дом', 'sound27', 'soundd27', 'image27');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Кыс', 'Дочь', 'sound28', 'soundd28', 'image28');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Наjылык', 'Дружба', 'sound29', 'soundd29', 'image29');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Наjылар', 'Друзья', 'sound30', 'soundd30', 'image30');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jÿрÿм', 'Жизнь', 'sound31', 'soundd31', 'image31');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jылдыстар', 'Звезды', 'sound32', 'soundd32', 'image32');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Су-кадык', 'Здоровье', 'sound33', 'soundd33', 'image33');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jер', 'Земля', 'sound34', 'soundd34', 'image34');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Билик', 'Знание', 'sound35', 'soundd35', 'image35');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Искусство', 'Искусство', 'sound36', 'soundd36', 'image36');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Таш', 'Камень', 'sound37', 'soundd37', 'image37');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Мöш', 'Кедр', 'sound38', 'soundd38', 'image38');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Бичиктер', 'Книги', 'sound39', 'soundd39', 'image39');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Аттар', 'Кони', 'sound40', 'soundd42', 'image40');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Оду', 'Костер', 'sound41', 'soundd41', 'image41');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jаражы', 'Красота', 'sound42', 'soundd42', 'image42');");

        // Lesson # 3                                                                                                                                                       // Lesson  # 3
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Культура', 'Культура', 'sound43', 'soundd43', 'image43');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Агаштар', 'Лес', 'sound44', 'soundd44', 'image44');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Литература', 'Литература', 'sound45', 'soundd45', 'image45');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Сÿÿген', 'Любимый', 'sound46', 'soundd46', 'image46');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Сÿÿген кижи', 'Любимый человек', 'sound47', 'soundd47', 'image47');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Сÿÿш', 'Любовь', 'sound48', 'soundd48', 'image48');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Эне', 'Мать', 'sound49', 'soundd49', 'image49');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Машина', 'Машина', 'sound50', 'soundd50', 'image50');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jер-телекей', 'Мир', 'sound51', 'soundd51', 'image51');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ӧбöгöни', 'Муж', 'sound52', 'soundd52', 'image52');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Музыка', 'Музыка', 'sound53', 'soundd53', 'image53');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ижениш', 'Надежда', 'sound54', 'soundd54', 'image54');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Албаты', 'Народ', 'sound55', 'soundd55', 'image55');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Тенери', 'Небо', 'sound56', 'soundd56', 'image56');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Камаан jогы', 'Независимость', 'sound57', 'soundd57', 'image57');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Тÿн', 'Ночь', 'sound58', 'soundd58', 'image58');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Аргалу jатканы', 'Обеспеченность', 'sound59', 'soundd59', 'image59');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Булуттар', 'Облака', 'sound60', 'soundd60', 'image60');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Билери', 'Образование', 'sound61', 'soundd61', 'image61');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Билижери', 'Общение', 'sound62', 'soundd62', 'image62');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('От', 'Огонь', 'sound63', 'soundd63', 'image63');");

        // Lesson # 4                                                                                                                                                       // Lesson  # 4
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Амыр', 'Отдых', 'sound64', 'soundd64', 'image64');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ада', 'Отец', 'sound65', 'soundd65', 'image65');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Очок', 'Очаг', 'sound66', 'soundd66', 'image66');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Кÿннин аайы', 'Погода', 'sound67', 'soundd67', 'image67');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Амыр', 'Покой', 'sound68', 'soundd68', 'image68');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jалан', 'Поле', 'sound69', 'soundd69', 'image69');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Болуш', 'Помощь', 'sound70', 'soundd70', 'image70');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ондооры', 'Понимание', 'sound71', 'soundd71', 'image71');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Чын', 'Правда', 'sound72', 'soundd72', 'image72');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ар-бyткен', 'Природа', 'sound73', 'soundd73', 'image73');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Куштар', 'Птицы', 'sound74', 'soundd74', 'image74');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Иш', 'Работа', 'sound75', 'soundd75', 'image75');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Сÿÿнуш', 'Радость', 'sound76', 'soundd76', 'image76');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Бала', 'Ребенок', 'sound77', 'soundd77', 'image77');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Агын суу', 'Река', 'sound78', 'soundd78', 'image78');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Сööк', 'Род', 'sound79', 'soundd79', 'image79');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Тöрöл', 'Родина', 'sound80', 'soundd80', 'image80');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ада-эне', 'Родители', 'sound81', 'soundd81', 'image91');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Тöрööндöр', 'Родственники', 'sound82', 'soundd82', 'image82');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jайым', 'Свобода', 'sound83', 'soundd83', 'image83');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Биле', 'Семья', 'sound84', 'soundd84', 'image84');");

        // Lesson # 5                                                                                                                                                       // Lesson  # 5
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jÿрек', 'Сердце', 'sound85', 'soundd85', 'image85');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Сыйын', 'Сестра', 'sound86', 'soundd86', 'image86');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ийт', 'Собака', 'sound87', 'soundd87', 'image87');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Уйат', 'Совесть', 'sound88', 'soundd88', 'image88');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Кÿн', 'Солнце', 'sound89', 'soundd89', 'image89');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Чындык', 'Справедливость', 'sound90', 'soundd90', 'image90');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Чöл', 'Степь', 'sound91', 'soundd91', 'image91');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Турумкайы', 'Стойкость', 'sound92', 'soundd92', 'image92');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Салым', 'Судьба', 'sound93', 'soundd93', 'image93');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ырыс кöрöри', 'Счастье', 'sound94', 'soundd94', 'image94');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Уул', 'Сын', 'sound95', 'soundd95', 'image95');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ӳÿр', 'Табун', 'sound96', 'soundd96', 'image96');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Университет', 'Университет', 'sound97', 'soundd97', 'image97');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Jенÿ', 'Успех', 'sound98', 'soundd98', 'image98');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ӳредÿ', 'Учеба', 'sound99', 'soundd99', 'image99');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ӳредÿчи', 'Учитель', 'sound100', 'soundd100', 'image100');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Чечектер', 'Цветы', 'sound101', 'soundd101', 'image101');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ак-чек', 'Честность', 'sound102', 'soundd102', 'image102');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Ару', 'Чистота', 'sound103', 'soundd103', 'image103');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Школ', 'Школа', 'sound104', 'soundd104', 'image104');");
        sqLiteDatabase.execSQL("INSERT INTO " + TableWords + " (" + WordAlt + ", " + WordRus + ", " + WordSoundOnRus + ", " + WordSoundOnAlt + "," + WordImage + ") VALUES ('Тил', 'Язык', 'sound105', 'soundd105', 'image105');");

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
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableUsers);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableWords);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableTests);
        onCreate(sqLiteDatabase);
    }
}
