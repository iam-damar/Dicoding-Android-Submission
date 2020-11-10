package com.damars.kulinerandroidpemuladamar;

import java.util.ArrayList;

public class DataKulinerMakanan {

    private static final String[] namaMakananKuliner = {
            "Dumbeg khas Blora",
            "Egg Roll",
            "Es Jati",
            "Kue Mancho",
            "Lontong Tahu Khas Blora",
            "Nasi Pecel Pincuk Daun Jati",
            "Sego Kobong",
            "Tape Sugihan",
            "Oseng Oseng Ungker",
            "Soto Klethuk",
    };

    private static final String[] detailmakananKuliner = {
            "Dumbeg Merupakan tradisional khas Blora yang bisa ditemukan dipasar tradisional, bentuk dumbeg sendiri menyerupai trompet, dumbeg terbuat dari bahan tepung, beras, gula aren dan garam yang kemudian dibungkus denngan Janur dan dibentuk seperti trompet.",
            "Egg roll merupakan Makanan khas Blora, yang memiliki citarasa unik, dimana bentuk dari eggroll ini sangat halus dan renyah, eggroll terbuat dari bahan utama telur, gula pasir, dan baking powder serta susu bubuk. Egg roll sangat cocok dihidangkan dengan teh hangat.",
            "Es Jati Merupakan Minuman khas Blora, yang terbuat dari pucuk daun jati yang masih muda, daun jati tersebut diperas dan dicampur dengan gula jawa sehingga menciptakan cairan hijau kemerahan, aroma daun jati pasti akan mengingatkan mu akan suasana desa indah nan permai, Es daun Jati ini sangat cocok dihidangkan pada siang hari saat cuaca panas.",
            "Kue Mancho, Merupakan Kue Jajanan Khas Blora yang paling diburu oleh wisatawan, dimana makanan ini terbuat dari tepung yang ditaburi wijen dan memiliki citarasa yang sangat enak.",
            "Lontong Tahu ini, memiliki keunikan tersendiri, dimana sebelum disajikan dengan lontong, tahu terlebih dahulu didicampur dengan telur dan di bumbui garam lalu digoreng, setelah matang baru tahu disajikan dengan lontong, untuk sambal cukup khas yaitu terbuat dari kacang tanah yang digoreng secara tradisional sehingga memberikan citarasa yang khas.",
            "Nasi Pecel ini sangat unik, dimana disajikan beralaskan Daun Jati yang menurut masyarakat blora dapat menambah kelezatan tersendiri, dan juga sambal pecel ini diolah begitu lembut sehingga membuat lumer di lidah.",
            "Sego Kobong ini jika diartikan dalam bahasa indonesia disebut nasi bakar, kuliner nasi bakar ini menjadi salah satu makanan khas Blora, ada banyak varian lauk untuk sego kobong ini yaitu cumi, ayam, opor, teri, ikan dan lain lain.",
            "Tape Sugihan merupakan makanan khas Blora yang wajib kamu coba, tapi ini memiliki keunikan yaitu terbuat dari singkong yang difermentasi, dan memiliki rasa yang tidak kalah lezat pula, cocok untuk dijadikan oleh oleh.",
            "Oseng Oseng Ungker merupakan makanan yang paling unik dan hanya ada di Blora, dimana ungker sendiri memiliki arti Ulat/Kepompong yan menempel diDaun Jati, dan Ulat ini dapat dijadikan makanan oleh Masyarakat Blora dan memiliki rasa yang sangat Lezat.",
            "Soto Klethuk, modelnya hampir sama dengan soto pada umumnya, akan tetapi Soto kletuk khas Blora ini memiliki keunikan yaitu dengan adanya Topping Klethuk berbentuk kotak yang ditaburkan disoto saat dihidangkan, klethuk ini terbuat dari singkong yang dikukus dipotong kecil kecil lalu digoreng hingga keemasan."
    };

    private static final String[] hargaMakananKuliner = {
            "Rp. 4.000 - Rp.6.000",
            "Rp. 17.000 - Rp.19.000",
            "Rp. 9.000 - Rp. 11.000",
            "Rp. 2.500 - Rp.5.000",
            "Rp. 7.500 - Rp.8.000",
            "Rp. 4.000 - 6.500",
            "Rp. 12.000 - 14.000",
            "Rp. 2.000 - Rp.4000",
            "Rp. 7000 - 12.000",
            "Rp. 16.000 - 18.000"
    };

    private static final int[] gambarMakananKuliner = {
            R.drawable.dumbeg,
            R.drawable.eggroll,
            R.drawable.esjati,
            R.drawable.kuemanco,
            R.drawable.lontongtahukhasblora,
            R.drawable.nasipecel,
            R.drawable.segokobong,
            R.drawable.tapesugihan,
            R.drawable.nasiungker,
            R.drawable.sotokletuk
    };

    static ArrayList<KulinerMakanan> getListData() {
        ArrayList<KulinerMakanan> list = new ArrayList<>();
        for(int position = 0; position < namaMakananKuliner.length; position++) {
            KulinerMakanan kulinerMakanan = new KulinerMakanan();
            kulinerMakanan.setNamaMakananKul(namaMakananKuliner[position]);
            kulinerMakanan.setDetaiMakananKul(detailmakananKuliner[position]);
            kulinerMakanan.setHargaMakananKul(hargaMakananKuliner[position]);
            kulinerMakanan.setPhoto(gambarMakananKuliner[position]);
            list.add(kulinerMakanan);
        }
        return list;
    }

}
