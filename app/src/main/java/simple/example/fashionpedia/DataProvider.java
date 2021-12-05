package simple.example.fashionpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.fashionpedia.model.Fashion;
import simple.example.fashionpedia.model.Gamis;
import simple.example.fashionpedia.model.Hijab;
import simple.example.fashionpedia.model.Mukenah;

public class DataProvider {
    private static List<Fashion> fashions = new ArrayList<>();

    private static List<Gamis> initDataGamis(Context ctx) {
        List<Gamis> gamiss = new ArrayList<>();
        gamiss.add(new Gamis("Lengan Lonceng Mandalika", "Poliester",
                "Gamis dengan warna teracotta yang memiliki donasi warna earthy tone ini sangatlah elegan untuk dikenakan di keseharian.", R.drawable.gamis_1));
        gamiss.add(new Gamis("Marwah Two tone", "Moscrepe",
                "Gamis syari dengan kombinasi dua warna yang klasik menjadi salah satu model gamis yang layak untuk koleksi", R.drawable.gamis_2));
        gamiss.add(new Gamis("Maxi dress ", "poliester",
                "Maxi dress dengan pola cuttingyang asimetrik dengan motif flora yang cantik membuat tampilan hijabers terlihat feminim secara instan", R.drawable.gamis_3));
        gamiss.add(new Gamis("flowy polos", "Arabian Crepe",
                "Dengan material arabian crepe premium, gamis ini akan terasa nyaman, adem tapi tidak menerawang", R.drawable.gamis_4));
        gamiss.add(new Gamis("gamis busui motif stripes", "katun",
                "gamis model kancing depannya yang simpel dan klasik membuat hijabers terutama busui merasa nyamamn  mengenakannya", R.drawable.gamis_5));
        gamiss.add(new Gamis("Gamis simpel timeless", "Jersy",
                "gamis dengan potongan simpel, model lurus yang satu ini bisa jadi andalan yang tepat untuk tampil kasual hingga formal kondangan ", R.drawable.gamis_6));
        return gamiss;
    }

    private static List<Hijab> initDataHijab(Context ctx) {
        List<Hijab> hijabs = new ArrayList<>();
        hijabs.add(new Hijab("pasmina", "Wolfis",
                "Hijab pasmina wolfis ukuran jumbo cocok unrtuk dipakai untuk muslimah yang ingin tampil elegan dan menutup aurrat", R.drawable.hijab_1));
        hijabs.add(new Hijab("Bergo sport", "Jersy",
                "Bergo sport jersy  dengan desain yang simpel sangat cocok untuk kita yang suka berolahraga", R.drawable.hijab_2));
        hijabs.add(new Hijab("Instan syaria bergo", "Wolfis Grade A",
                "Hijab instan syaria bergo dengan bahan wolfis grade A yang adem tidak mudah kusut dan tidak menerawang sangat cocok untuk dipai sehari-hari ", R.drawable.hijab_3));
        hijabs.add(new Hijab("Segitempat ", "Wolfis",
                "segiempat wolfis dengan ukuran 115 130 dan 150 sangat cocok untuk dipakai sehari-hari", R.drawable.hijab_4));
        hijabs.add(new Hijab("Bergo Non pet antem", "wolfis",
                "Bergo non pet antem dengan ukuran jumbo sangat cocok untuk pencinta hijab bergo simpel tapi tetap terlihat elegan", R.drawable.hijab_5));
        hijabs.add(new Hijab("segiempat syari cadar", "wolfis",
                "Hijab segiempat dengan bahan wolfis tidak mudah kusut dan tidak menerawang, bagi yang suka pakai cadar sangat cocok karena dapat free cadar ", R.drawable.hijab_6));
        return hijabs;
    }
    private static List<Mukenah> initDataMukenah(Context ctx) {
        List<Mukenah> mukenahs = new ArrayList<>();
        mukenahs.add(new Mukenah("Mukenah dewasa maxmar printing", "maxmar",
                "Mukenah maxmar dilengkapi renda rajut dengan lebar 6 cm ada aksen tali ikat kepala menggunakan tali bukan karet", R.drawable.mukenah_1));
        mukenahs.add(new Mukenah("Mukenah bai katun rayon renda", "katun rayon",
                "Mukenah dewasa katun rayon hadir untuk anda yang mengutamakan kualitasdengan harga yang sangat murah tapi kualitas bahan tetap nomor satu", R.drawable.mukenah_2));
        mukenahs.add(new Mukenah("Mukenah dewasa katungprinting ", "Katun alena ",
                "Mukena dewasa katun renda mikro printing  dengan aksen tali bukan karet membuat tampilan menjadi elegan", R.drawable.mukenah_3));
        mukenahs.add(new Mukenah("Mukenah bai katun rayon renda ", "Shifon series",
                "Mukenah bali dewasa katun rayon premium renda hadir untuk anda yang mengutamakan kualitas dengan harga yang terjangkau", R.drawable.mukenah_4));
        mukenahs.add(new Mukenah("Mukena Dewasa katun polos jumbo", "Katun Raniyah series",
                "Mukena dewasa katun polos jumbo raniyah series hadir untuk anda yang mementingkan kalitas namun dengan harga terjangkau tapi menggunakan bahan yang tidak mudah kusut dan tidak menerawang", R.drawable.mukenah_5));
        mukenahs.add(new Mukenah("Mukena dewasa bordir renda", "Katun Zareena series",
                "mukenah dewasa bordir renda menggunakan bahan katun mikro yang sangat faliliar digunakan unuk mukenah siti hadijah ", R.drawable.mukenah_6));
        return mukenahs;
    }


    private static void initAllFashions(Context ctx) {
        fashions.addAll(initDataGamis(ctx));
        fashions.addAll(initDataHijab(ctx));
        fashions.addAll(initDataMukenah(ctx));
    }

    public static List<Fashion> getAllFashion(Context ctx) {
        if (fashions.size() == 0) {
            initAllFashions(ctx);
        }
        return  fashions;
    }

    public static List<Fashion> getFashionsByTipe(Context ctx, String model) {
        List<Fashion> fashionsByType = new ArrayList<>();
        if (fashions.size() == 0) {
            initAllFashions(ctx);
        }
        for (Fashion h : fashions) {
            if (h.getModel().equals(model)) {
                fashionsByType.add(h);
            }
        }
        return fashionsByType;
    }

}
