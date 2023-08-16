package com.example.comiccorner.networking;



public class ApiEndpoint {

    public static String BASEURL = "https://mangamint.kaedenoki.net/api/manga/page/{endpoint}";
    public static String ALSOURL = "https://mangamint.kaedenoki.net/api/recommended";
    public static String GENREURL = "https://mangamint.kaedenoki.net/api/genres";
    public static String DETAILMANGAURL = "https://mangamint.kaedenoki.net/api/manga/detail/{endpoint}";
    public static String CHAPTERURL = "https://mangamint.kaedenoki.net/api/chapter/{chapterEndpoint}";
    public static String GENREDETAIL = "https://mangamint.kaedenoki.net/api/genres/{endpoint}/{pagenumber}";

}