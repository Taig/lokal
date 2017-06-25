package io.taig.lokal

case class Language( value: String ) extends AnyVal

/**
 * Predefined languages, represented by their ISO 639-1 codes
 *
 * @see http://data.okfn.org/data/core/language-codes#resource-language-codes
 */
object Language {
    val aa = Language( "aa" ) // Afar
    val ab = Language( "ab" ) // Abkhazian
    val ae = Language( "ae" ) // Avestan
    val af = Language( "af" ) // Afrikaans
    val ak = Language( "ak" ) // Akan
    val am = Language( "am" ) // Amharic
    val an = Language( "an" ) // Aragonese
    val ar = Language( "ar" ) // Arabic
    val as = Language( "as" ) // Assamese
    val av = Language( "av" ) // Avaric
    val ay = Language( "ay" ) // Aymara
    val az = Language( "az" ) // Azerbaijani
    val ba = Language( "ba" ) // Bashkir
    val be = Language( "be" ) // Belarusian
    val bg = Language( "bg" ) // Bulgarian
    val bh = Language( "bh" ) // Bihari languages
    val bi = Language( "bi" ) // Bislama
    val bm = Language( "bm" ) // Bambara
    val bn = Language( "bn" ) // Bengali
    val bo = Language( "bo" ) // Tibetan
    val br = Language( "br" ) // Breton
    val bs = Language( "bs" ) // Bosnian
    val ca = Language( "ca" ) // Catalan; Valencian
    val ce = Language( "ce" ) // Chechen
    val ch = Language( "ch" ) // Chamorro
    val co = Language( "co" ) // Corsican
    val cr = Language( "cr" ) // Cree
    val cs = Language( "cs" ) // Czech
    val cu = Language( "cu" ) // Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic
    val cv = Language( "cv" ) // Chuvash
    val cy = Language( "cy" ) // Welsh
    val da = Language( "da" ) // Danish
    val de = Language( "de" ) // German
    val dv = Language( "dv" ) // Divehi; Dhivehi; Maldivian
    val dz = Language( "dz" ) // Dzongkha
    val ee = Language( "ee" ) // Ewe
    val el = Language( "el" ) // Greek, Modern (1453-)
    val en = Language( "en" ) // English
    val eo = Language( "eo" ) // Esperanto
    val es = Language( "es" ) // Spanish; Castilian
    val et = Language( "et" ) // Estonian
    val eu = Language( "eu" ) // Basque
    val fa = Language( "fa" ) // Persian
    val ff = Language( "ff" ) // Fulah
    val fi = Language( "fi" ) // Finnish
    val fj = Language( "fj" ) // Fijian
    val fo = Language( "fo" ) // Faroese
    val fr = Language( "fr" ) // French
    val fy = Language( "fy" ) // Western Frisian
    val ga = Language( "ga" ) // Irish
    val gd = Language( "gd" ) // Gaelic; Scottish Gaelic
    val gl = Language( "gl" ) // Galician
    val gn = Language( "gn" ) // Guarani
    val gu = Language( "gu" ) // Gujarati
    val gv = Language( "gv" ) // Manx
    val ha = Language( "ha" ) // Hausa
    val he = Language( "he" ) // Hebrew
    val hi = Language( "hi" ) // Hindi
    val ho = Language( "ho" ) // Hiri Motu
    val hr = Language( "hr" ) // Croatian
    val ht = Language( "ht" ) // Haitian; Haitian Creole
    val hu = Language( "hu" ) // Hungarian
    val hy = Language( "hy" ) // Armenian
    val hz = Language( "hz" ) // Herero
    val ia = Language( "ia" ) // Interlingua (International Auxiliary Language Association)
    val id = Language( "id" ) // Indonesian
    val ie = Language( "ie" ) // Interlingue; Occidental
    val ig = Language( "ig" ) // Igbo
    val ii = Language( "ii" ) // Sichuan Yi; Nuosu
    val ik = Language( "ik" ) // Inupiaq
    val io = Language( "io" ) // Ido
    val is = Language( "is" ) // Icelandic
    val it = Language( "it" ) // Italian
    val iu = Language( "iu" ) // Inuktitut
    val ja = Language( "ja" ) // Japanese
    val jv = Language( "jv" ) // Javanese
    val ka = Language( "ka" ) // Georgian
    val kg = Language( "kg" ) // Kongo
    val ki = Language( "ki" ) // Kikuyu; Gikuyu
    val kj = Language( "kj" ) // Kuanyama; Kwanyama
    val kk = Language( "kk" ) // Kazakh
    val kl = Language( "kl" ) // Kalaallisut; Greenlandic
    val km = Language( "km" ) // Central Khmer
    val kn = Language( "kn" ) // Kannada
    val ko = Language( "ko" ) // Korean
    val kr = Language( "kr" ) // Kanuri
    val ks = Language( "ks" ) // Kashmiri
    val ku = Language( "ku" ) // Kurdish
    val kv = Language( "kv" ) // Komi
    val kw = Language( "kw" ) // Cornish
    val ky = Language( "ky" ) // Kirghiz; Kyrgyz
    val la = Language( "la" ) // Latin
    val lb = Language( "lb" ) // Luxembourgish; Letzeburgesch
    val lg = Language( "lg" ) // Ganda
    val li = Language( "li" ) // Limburgan; Limburger; Limburgish
    val ln = Language( "ln" ) // Lingala
    val lo = Language( "lo" ) // Lao
    val lt = Language( "lt" ) // Lithuanian
    val lu = Language( "lu" ) // Luba-Katanga
    val lv = Language( "lv" ) // Latvian
    val mg = Language( "mg" ) // Malagasy
    val mh = Language( "mh" ) // Marshallese
    val mi = Language( "mi" ) // Maori
    val mk = Language( "mk" ) // Macedonian
    val ml = Language( "ml" ) // Malayalam
    val mn = Language( "mn" ) // Mongolian
    val mr = Language( "mr" ) // Marathi
    val ms = Language( "ms" ) // Malay
    val mt = Language( "mt" ) // Maltese
    val my = Language( "my" ) // Burmese
    val na = Language( "na" ) // Nauru
    val nb = Language( "nb" ) // Bokmål, Norwegian; Norwegian Bokmål
    val nd = Language( "nd" ) // Ndebele, North; North Ndebele
    val ne = Language( "ne" ) // Nepali
    val ng = Language( "ng" ) // Ndonga
    val nl = Language( "nl" ) // Dutch; Flemish
    val nn = Language( "nn" ) // Norwegian Nynorsk; Nynorsk, Norwegian
    val no = Language( "no" ) // Norwegian
    val nr = Language( "nr" ) // Ndebele, South; South Ndebele
    val nv = Language( "nv" ) // Navajo; Navaho
    val ny = Language( "ny" ) // Chichewa; Chewa; Nyanja
    val oc = Language( "oc" ) // Occitan (post 1500); Provençal
    val oj = Language( "oj" ) // Ojibwa
    val om = Language( "om" ) // Oromo
    val or = Language( "or" ) // Oriya
    val os = Language( "os" ) // Ossetian; Ossetic
    val pa = Language( "pa" ) // Panjabi; Punjabi
    val pi = Language( "pi" ) // Pali
    val pl = Language( "pl" ) // Polish
    val ps = Language( "ps" ) // Pushto; Pashto
    val pt = Language( "pt" ) // Portuguese
    val qu = Language( "qu" ) // Quechua
    val rm = Language( "rm" ) // Romansh
    val rn = Language( "rn" ) // Rundi
    val ro = Language( "ro" ) // Romanian; Moldavian; Moldovan
    val ru = Language( "ru" ) // Russian
    val rw = Language( "rw" ) // Kinyarwanda
    val sa = Language( "sa" ) // Sanskrit
    val sc = Language( "sc" ) // Sardinian
    val sd = Language( "sd" ) // Sindhi
    val se = Language( "se" ) // Northern Sami
    val sg = Language( "sg" ) // Sango
    val si = Language( "si" ) // Sinhala; Sinhalese
    val sk = Language( "sk" ) // Slovak
    val sl = Language( "sl" ) // Slovenian
    val sm = Language( "sm" ) // Samoan
    val sn = Language( "sn" ) // Shona
    val so = Language( "so" ) // Somali
    val sq = Language( "sq" ) // Albanian
    val sr = Language( "sr" ) // Serbian
    val ss = Language( "ss" ) // Swati
    val st = Language( "st" ) // Sotho, Southern
    val su = Language( "su" ) // Sundanese
    val sv = Language( "sv" ) // Swedish
    val sw = Language( "sw" ) // Swahili
    val ta = Language( "ta" ) // Tamil
    val te = Language( "te" ) // Telugu
    val tg = Language( "tg" ) // Tajik
    val th = Language( "th" ) // Thai
    val ti = Language( "ti" ) // Tigrinya
    val tk = Language( "tk" ) // Turkmen
    val tl = Language( "tl" ) // Tagalog
    val tn = Language( "tn" ) // Tswana
    val to = Language( "to" ) // Tonga (Tonga Islands)
    val tr = Language( "tr" ) // Turkish
    val ts = Language( "ts" ) // Tsonga
    val tt = Language( "tt" ) // Tatar
    val tw = Language( "tw" ) // Twi
    val ty = Language( "ty" ) // Tahitian
    val ug = Language( "ug" ) // Uighur; Uyghur
    val uk = Language( "uk" ) // Ukrainian
    val ur = Language( "ur" ) // Urdu
    val uz = Language( "uz" ) // Uzbek
    val ve = Language( "ve" ) // Venda
    val vi = Language( "vi" ) // Vietnamese
    val vo = Language( "vo" ) // Volapük
    val wa = Language( "wa" ) // Walloon
    val wo = Language( "wo" ) // Wolof
    val xh = Language( "xh" ) // Xhosa
    val yi = Language( "yi" ) // Yiddish
    val yo = Language( "yo" ) // Yoruba
    val za = Language( "za" ) // Zhuang; Chuang
    val zh = Language( "zh" ) // Chinese
    val zu = Language( "zu" ) // Zulu
}