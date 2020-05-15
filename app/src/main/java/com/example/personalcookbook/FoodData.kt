package com.example.personalcookbook

object FoodData {
    private val foodNames = arrayOf(
        "Ayam Goreng Mentega",
        "Cumi Goreng Tepung",
        "Indomie Seblak",
        "Sayur Bobor",
        "Soun Goreng",
        "Tahu Tek",
        "Telur Barenda",
        "Telur Gulung",
        "Tumis Jamur",
        "Tumis Kangkung")

    private val foodDetails = arrayOf(
        "Hidangan daging ayam fillet dada yang diolah dengan bmbu racikan pilihan serta dibalut dengan saus mentega yang nikmat sangat cocok bagi anda yang tidak menyukai rasa pedas",
        "Cumi yang digoreng dengan tepung roti, memiliki rasa renyah dan gurih yang cocok untuk hidangan utama",
        "Makanan simpel, enak dan tentu saja cocok untuk makanan di akhir bulan",
        "Jujur saya juga tidak tau ini makanan apa",
        "Salah satu andalan di setiap restoran chinese food. Mudah dan sangat cocok untuk menjadi makanan sekeluarga",
        "Tahu tek tek tek",
        "Telur yang di masak barenda(?). Makanan unik yang belum pernah saya coba sebelumnya",
        "Bukan telur gulung yang biasa terdapat pada sekolah dasar melainkan telur gulung yang biasa terdapat di meja makan setiap rumah",
        "Jamur yang ditumis",
        "Kangkung yang ditumis")

    private val foodRecipes = arrayOf(
        "1. Lumuri daging ayam dengan bumbu halus hingga rata\n\n2. Goreng dalam minyak panas dan banyak hingga kering. Angkat dan tiriskan\n\n3. Tumis bawang bombay hingga layu\n\n4. Mauskan bumbu, aduk hingga rata\n\n5. Masukan ayam goreng. Masak hingga bumbu meresap\n\n6. Angkat lalu sajikan",
        "1. Aduk rata cumi, bawnag putih, merica, kaldu dan garam\n\n2. Campur terigu dan maizena, aduk rata\n\n3. Masukan 1 butir telur ke cumi\n\n4. Gulingkan cumi pada tepung\n\n5. Goreng cumi dalam minyak panas sampai kecoklatan\n\n6. Sajikan selagi panas",
        "1. Masak indomie\n\n2. Masukan kerupuk\n\n3. Masukan telur\n\n4. Hidangkan",
        "1. Didihkan santan encer dan bumbu halus bersama daun salam, dan lengkuas\n\n2. Masukan labu siam dan tempe, didihkan hingga keduanya lunak\n\n3. Masukan daun bayam/kangkung/daun kacang\n\n4. Tuangi santan kental\n\n5. Didihkan sebentar lalu angkat\n\n6. Sajikan dengan sambal dan kerupuk",
        "1. Tumis bumbu halus dan masukan lauk\n\n2. Masukan soun dan beri penyedap\n\n3. Koreksi rasanya\n\n4. Hidangkan selagi panas",
        "1. Kocok telur dengan garam dan merica hingga rata\n\n2. Campur irisan tahu dengan telur hingga rata\n\n3. Bagi menjadi 4 bagian dan goreng menjadi dadar hingga matang kedua sisinya. Angkat\n\n4. Aduk bumbu halus dengan bahan saus lainnya hingga rata\n\n5. Taruh tahu telur di piring saji\n\n6. Siram dengan saus dan sajikan",
        "1. Pecahkan telur dalam mangkung dan kocok hingga lepas dan berbuih\n\n2. Masukan sambal dan daun bawang. Kocok hingga rata\n\n3. Panaskan minyak banyak dalam wajan\n\n4. Masukan telur kocok\n\n5. Masak hingga permukaan yang keriting mengering\n\n6. Angkat, tiriskan dan sajikan",
        "1. Taruh minyak 1/3 wajan dan panaskan\n\n2. Masukan telur\n\n3. Kocok hingga berbusa\n\n4. Gulung-gulung\n\n5. ANGKAT",
        "1. Iris bahan sayur dan semua bumbu dan cincang bawang\n\n2. Tumis bawang merah dan bawang putih hingga harum dan masukan cabai\n\n3. Masukan jamur dan masak hingga matang\n\n4. Tambahkan penyedap dan hidangkan",
        "1. Bersihkan kangkung, potong agak pendek\n\n2. Panaskan minak, tumis bumbu halus hingga wangi\n\n3. Beri kaldu bubuk, saus tiram, garam, gula dan merica bubuk\n\n4. Aduk hingga wangi dan matang. Tuangi air secukupnya\n\n5. Setelah mendidih, masukan kangkung\n\n6. Besarkan api. Aduk hingga kangkung layu\n\n7. Angkat dan sajikan"
    )

    private val foodIngredients = arrayOf(
        "1\tekor ayam negri, potong 8 buah\n2\tsiung bawang putih\n1/2\tsdt merica butiran\n2\tsdt garam\n2\tsdm mentega\n75\tg bawang bombay, iris kasar\n2\tsdm saus Inggris\n1\tsdm kecapasin\n1\tsdm kecap manis\n1\tsdm air jeruk nipis/limau\n1\tsdm garam",
        "500\tgr cumi, potong cincin\n7\tsiung bawang putih. Haluskan\n1/2\tsdt merica\n2\tsdt garam\n1\tbutir telur\n5\tsendok terigu\n1\tsendok maizena",
        "1\tbungkus indomie\n1\tbutir telur\nkerupuk kuning\ncabai",
        "150\tg daun bayam/kangkung/daun kacang\n250\tg labu siam, kupas, potong-potong\n100\tg tempe, potong-potong\n600\tml santan encer\n250\tml santan kental\n2\tlembar daun salam\n1\tcm lengkuas, memarkan\n5\tbutir bawang merah\n3\tsiung bawang putih\n2\tcm kencur\n1\tsdt ketumbar\n1/2\tsdt gula pasir\n2\tsdt garam",
        "2\tsoun sachet\n2\tgr sayur sawi\n2\tbuah bakso\n1\tbutir telur\n3\tsiung bawang putih dan merah\n2\tcabe rawit\npenyedap makanan dan bumbu halus",
        "1\ttahu putih\n2\tbutir telur ayam\n2\tsdm kecap manis\n2\tsdm kacang tanah goreng\n1\tsiung bawang putih",
        "3\tButir telur ayam\n2\tsdm sambal terasi atau sambal bajak\n2\tsdm daun bawang iris kasar\nMinyak goreng",
        "1\tbutir telur\n2\tsendok makan air\nPenyedap rasa\nMinyak\n2\tsdm mentega\n",
        "150\tgr jamur tiram\n2\tsiung bawang putih dan merah\n2\tbuah cabai\nbumbu penyedap",
        "2\tIkat kangkung\n4\tSiung bawang putih, iris tipis\n1/2\tcm jaher, iris tipis\n3\tsdm saus tiram\n1/2\tsdt gula pasir\n1/2\tsdt merica bubuk\n1\tsdm kaldu bubuk tanpa MSG\n1\tsdt garam\n5\tButir bawang merah\n2\t sdt terasi goreng\n1\t sdm ebi yang digiling halus"
    )

    private val foodDurasi = arrayOf(
        "45 - 60 Menit",
        "15 - 20 Menit",
        "~10 Menit",
        "25 - 40 Menit",
        "45 - 60 Menit",
        "25 - 40 Menit",
        "~10 Menit",
        "~10 Menit",
        "15 - 20 Menit",
        "15 - 20 Menit"
    )

    private val foodPortion = arrayOf(
        "5 - 6 Orang",
        "3 - 4 Orang",
        "1 Orang",
        "5 - 6 Orang",
        "5 - 6 Orang",
        "3 - 4 Orang",
        "2 - 3 Orang",
        "1 Orang",
        "3 - 4 Orang",
        "3 - 4 Orang"
    )

    private val foodImages = intArrayOf(
        R.drawable.ayam_mentega,
        R.drawable.cumi_tepung,
        R.drawable.indomie_seblak,
        R.drawable.sayur_bobor,
        R.drawable.soun_goreng,
        R.drawable.tahu_tek,
        R.drawable.telur_barenda,
        R.drawable.telur_gulung,
        R.drawable.tumis_jamur,
        R.drawable.tumis_kangkung)

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.recipe = foodRecipes[position]
                food.photo = foodImages[position]
                food.durasi = foodDurasi[position]
                food.portion = foodPortion[position]
                food.ingredients = foodIngredients[position]
                list.add(food)
            }
            return list
        }
}