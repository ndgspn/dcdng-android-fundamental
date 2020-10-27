package com.example.duniahewan.model

import com.example.duniahewan.R

object AnimalsData {
    private val animalNames = arrayOf(
        "Sapi",
        "Kambing",
        "Kucing",
        "Anjing",
        "Babi",
        "Ular",
        "Kelinci",
        "Gajah",
        "Jerapah",
        "Beruang",
        "Badak"
    )

    private val animalScientificN = arrayOf(
        "Bos Taurus",
        "Capra Aegagrus Hircus",
        "Felis Catus",
        "Canis Lupus Familiaris",
        "Sus",
        "Serpentes",
        "Oryctolagus Cuniculus",
        "Elephas Maximus",
        "Giraffa",
        "Ursidae",
        "Rhinocerotidae"

    )

    private val animalGrestationPeriod = arrayOf(
        "283",
        "150",
        "58 - 67",
        "58 - 68",
        "115",
        "-",
        "27",
        "18 - 22",
        "456",
        "180 - 270",
        "486 - 547"
    )

    private val animalSummary = arrayOf(
        "Sapi adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan lembu. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia. Hasil sampingannya seperti kulit, jeroan, tanduk, dan kotorannya juga dimanfaatkan untuk berbagai keperluan manusia. Di sejumlah tempat, sapi juga dipakai sebagai penggerak alat transportasi, pengolahan lahan tanam (bajak), dan alat industri lain (seperti peremas tebu). Karena banyak kegunaan ini, sapi telah menjadi bagian dari berbagai kebudayaan manusia sejak lama.",
        "Kambing ternak (Capra aegagrus hircus) merupakan salah satu subspesies kambing yang dipelihara atau dijinakkan dari kambing liar Asia Barat Daya dan Eropa Timur. Kambing merupakan anggota dari keluarga Bovidae dan bersaudara dengan dengan biri-biri karena keduanya tergolong dalam sub famili Caprinae. Terdapat lebih 300 jenis kambing yang berbeda-beda. Kambing adalah salah satu di antara spesies yang paling lama di ternakkan, yaitu untuk susu, daging, bulu, dan kulit di seluruh dunia. Pada tahun 2011, populasi kambing yang hidup di seluruh dunia mencapai 924 juta menurut Organisasi Pangan dan Pertanian Perserikatan Bangsa-Bangsa.",
        "Kucing disebut juga kucing domestik atau kucing rumah (nama ilmiah: Felis silvestris catus atau Felis catus) adalah sejenis mamalia karnivora dari keluarga Felidae. Kata \"kucing\" biasanya merujuk kepada \"kucing\" yang telah dijinakkan, tetapi bisa juga merujuk kepada \"kucing besar\" seperti singa dan harimau.\n" +
                "\n" +
                "Kucing telah berbaur dengan kehidupan manusia paling tidak sejak 6.000 tahun SM, dari kerangka kucing di Pulau Siprus. Orang Mesir Kuno dari 3.500 SM telah menggunakan kucing untuk menjauhkan tikus atau hewan pengerat lain dari lumbung yang menyimpan hasil panen.",
        "Anjing adalah mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu, bahkan kemungkinan sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA. Penelitian lain mengungkap sejarah domestikasi anjing yang belum begitu lama.\n" +
                "\n" +
                "Anjing telah berkembang menjadi ratusan ras dengan berbagai macam variasi. Warna rambut anjing bisa beraneka ragam, mulai dari putih sampai hitam, juga merah, abu-abu (sering disebut \"biru\"), dan coklat. Selain itu, anjing memiliki berbagai jenis rambut. Rambut anjing bisa lurus atau keriting, dan bertekstur kasar hingga lembut seperti benang w",
        "Babi adalah sejenis hewan ungulata yang bermoncong panjang dan berhidung lemper dan merupakan hewan yang aslinya berasal dari Eurasia. Babi merupakan omnivora yang berarti mereka mengonsumsi daging maupun tumbuh-tumbuhan. Selain itu, babi termasuk salah satu mamalia yang paling cerdas, dan dilaporkan lebih pintar dan mudah dipelihara dibandingkan dengan anjing dan kucing.",
        "Ular adalah kelompok reptilia tidak berkaki dan bertubuh panjang yang tersebar luas di dunia. Secara ilmiah, semua jenis ular dikelompokkan dalam satu subordo, yaitu Serpentes dan juga merupakan anggota dari ordo Squamata (reptilia bersisik), bersama-sama dengan kadal. Akan tetapi, ular (Serpentes) sendiri diklasifikasikan pada cabang (klade) Ophidia, yaitu segolongan reptilia-reptilia dengan atau tanpa kaki, bertubuh panjang, dan memiliki fisiologis yang sangat berbeda dengan kadal.",
        "Kelinci adalah hewan mamalia dari famili Leporidae, yang dapat ditemukan di banyak bagian bumi. Kelinci berkembangbiak dengan cara beranak yang disebut vivipar. Dulunya, hewan ini adalah hewan liar yang hidup di Afrika hingga ke daratan Eropa. Pada perkembangannya, tahun 1912, kelinci diklasifikasikan dalam ordo Lagomorpha. Ordo ini dibedakan menjadi dua famili, yakni Ochtonidae (jenis pika yang pandai bersiul) dan Leporidae (termasuk di dalamnya jenis kelinci dan terwelu). Asal kata kelinci berasal dari bahasa Belanda, yaitu konijntje yang berarti \"anak kelinci\". Hal ini menunjukkan bahwa masyarakat Nusantara mulai mengenali kelinci saat masa kolonial, padahal di Pulau Sumatra ada satu spesies asli kelinci sumatera (Nesolagus netscheri) yang baru ditemukan pada tahun 1972.ol.",
        "Gajah adalah mamalia besar dari famili Elephantidae dan ordo Proboscidea. Secara tradisional, terdapat dua spesies yang diakui, yaitu gajah afrika (Loxodonta africana) dan gajah asia (Elephas maximus), walaupun beberapa bukti menunjukkan bahwa gajah semak afrika dan gajah hutan afrika merupakan spesies yang berbeda (L. africana dan L. cyclotis). Gajah tersebar di seluruh Afrika sub-Sahara, Asia Selatan, dan Asia Tenggara. Elephantidae adalah satu-satunya famili dari ordo Proboscidea yang masih ada; famili lain yang kini sudah punah termasuk mamut dan mastodon. Gajah afrika jantan merupakan hewan darat terbesar dengan tinggi hingga 4 m dan massa yang juga dapat mencapai 7.000 kg. Gajah memiliki ciri-ciri khusus, dan yang paling mencolok adalah belalai atau proboscis yang digunakan untuk banyak hal, terutama untuk bernapas, menghisap air, dan mengambil benda. Gigi serinya tumbuh menjadi taring yang dapat digunakan sebagai senjata dan alat untuk memindahkan benda atau menggali. Daun telinganya yang besar membantu mengatur suhu tubuh mereka. Gajah afrika memiliki telinga yang lebih besar dan punggung yang cekung, sementara telinga gajah asia lebih kecil dan punggungnya cembung.",
        "Jerapah atau zarafah (nama ilmiah: Giraffa camelopardalis) adalah mamalia berkuku genap endemik Afrika dan merupakan spesies hewan tertinggi yang hidup di darat. Jerapah jantan dapat mencapai tinggi 4,8 sampai 5,5 meter dan memiliki berat yang dapat mencapai 1.360 kilogram. Jerapah betina biasanya sedikit lebih pendek dan lebih ringan.\n" +
                "\n" +
                "Jerapah berkerabat dengan rusa dan sapi tetapi dari suku yang berbeda, yaitu Giraffidae yang mencakup jerapah sendiri dan kerabat terdekatnya, okapi. Habitat aslinya mencakup area dari Chad sampai dengan Afrika Selatan",
        "Beruang (KBBI: be·ru·ang) adalah binatang buas jenis Ursus, berbulu tebal, dapat berdiri di atas kedua kakinya, bercakar, dan bermoncong panjang[1].Atau dalam (Inggris: bear) yang berasal dari Bahasa Inggris kuno yaitu bera.\n" +
                "Dalam nama ilmiahnya Ursidae. Ursidae sendiri berasal dari dua kata yaitu ursus dan idae. Ursus berasal dari bahasa latin ursus yang berarti beruang, dan idae berasal dari bahasa Yunani kuno Eidos (bahasa Yunani: εἶδος).",
        "Badak (bahasa Inggris: rhinoceros) adalah lima spesies hewan dari famili Rhinocerotidae, ordo Perissodactyla yang kesemuanya berasal dari Afrika atau Asia."
    )

    private val animalPhoto = intArrayOf(
        R.drawable.sapi,
        R.drawable.kambing,
        R.drawable.kucing,
        R.drawable.anjing,
        R.drawable.babi,
        R.drawable.ular,
        R.drawable.kelinci,
        R.drawable.gajah,
        R.drawable.jerapah,
        R.drawable.beruang,
        R.drawable.badak
    )

    private val animalSpeed = arrayOf(
        "40",
        "60",
        "48",
        "57.6",
        "48",
        "1.6",
        "60",
        "24",
        "60",
        "40",
        "50"
    )

    private val animalLongOflief = arrayOf(
        "18 - 22",
        "15 - 18",
        "2 - 16",
        "10 - 13",
        "8",
        "9",
        "1 - 2",
        "60 - 70",
        "25",
        "20",
        "35 - 50"
    )

    val listData: ArrayList<Animal>
        get() {
            val list = arrayListOf<Animal>()
            for (position in animalNames.indices) {
                val animal = Animal()
                animal.name = animalNames[position]
                animal.scientificN = animalScientificN[position]
                animal.grestationPeriod = animalGrestationPeriod[position]
                animal.summary = animalSummary[position]
                animal.photo = animalPhoto[position]
                animal.speed = animalSpeed[position]
                animal.longOfLife = animalLongOflief[position]
                list.add(animal)
            }

            return list
        }
}

