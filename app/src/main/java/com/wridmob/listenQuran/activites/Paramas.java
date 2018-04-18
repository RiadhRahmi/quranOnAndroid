package com.wridmob.listenQuran.activites;

import android.app.Activity;
import android.os.Environment;

import com.wridmob.listenQuran.R;

import java.io.File;
import java.util.ArrayList;

public class Paramas {

    public ArrayList<String> ServerFolderName = new ArrayList<>();
    public ArrayList<Author> AutherListInfo = new ArrayList<>();
    private ArrayList<Author> ListAya = new ArrayList<>();
    public ArrayList<Author> ListAyaRanage = new ArrayList<>();
    Activity activity;

    public Paramas(Activity activity) {
        this.activity = activity;
    }


    public static String avalible() {
            return ("من الهاتف");
    }

    public static String disavalible() {
            return ("بث مباشر");

    }


    public ArrayList<Author> AutherList() {
        AutherListInfo.clear();

        AutherListInfo.add(new Author("shatri", activity.getResources().getString(R.string.author1)));
        AutherListInfo.add(new Author("ahmad_huth", activity.getResources().getString(R.string.author2)));
        AutherListInfo.add(new Author("hawashi", activity.getResources().getString(R.string.author3)));
        AutherListInfo.add(new Author("trabulsi", activity.getResources().getString(R.string.author4)));
        AutherListInfo.add(new Author("ajm", activity.getResources().getString(R.string.author5)));
        AutherListInfo.add(new Author("trablsi", activity.getResources().getString(R.string.author6)));
        AutherListInfo.add(new Author("saud", activity.getResources().getString(R.string.author7)));
        AutherListInfo.add(new Author("saber", activity.getResources().getString(R.string.author8)));
        AutherListInfo.add(new Author("Aamer", activity.getResources().getString(R.string.author9)));
        AutherListInfo.add(new Author("ahmad_nu", activity.getResources().getString(R.string.author10)));


        AutherListInfo.add(new Author("akil", activity.getResources().getString(R.string.author11)));
        AutherListInfo.add(new Author("akrm", activity.getResources().getString(R.string.author12)));
        AutherListInfo.add(new Author("akdr", activity.getResources().getString(R.string.author13)));
        AutherListInfo.add(new Author("IbrahemSadan", activity.getResources().getString(R.string.author14)));
        AutherListInfo.add(new Author("abkr", activity.getResources().getString(R.string.author15)));
        AutherListInfo.add(new Author("jbreen", activity.getResources().getString(R.string.author16)));
        AutherListInfo.add(new Author("jormy", activity.getResources().getString(R.string.author17)));
        AutherListInfo.add(new Author("ibrahim_dosri_warsh", activity.getResources().getString(R.string.author18)));
        AutherListInfo.add(new Author("3siri", activity.getResources().getString(R.string.author19)));
        AutherListInfo.add(new Author("zamri", activity.getResources().getString(R.string.author20)));

        AutherListInfo.add(new Author("3zazi", activity.getResources().getString(R.string.author21)));
        AutherListInfo.add(new Author("dokali", activity.getResources().getString(R.string.author22)));
        AutherListInfo.add(new Author("alzain", activity.getResources().getString(R.string.author23)));
        AutherListInfo.add(new Author("omran", activity.getResources().getString(R.string.author24)));
        AutherListInfo.add(new Author("koshi", activity.getResources().getString(R.string.author25)));
        AutherListInfo.add(new Author("fateh", activity.getResources().getString(R.string.author26)));
        AutherListInfo.add(new Author("qari", activity.getResources().getString(R.string.author27)));
        AutherListInfo.add(new Author("twfeeq", activity.getResources().getString(R.string.author28)));
        AutherListInfo.add(new Author("jamal", activity.getResources().getString(R.string.author29)));
        AutherListInfo.add(new Author("jaman", activity.getResources().getString(R.string.author30)));

        AutherListInfo.add(new Author("hatem", activity.getResources().getString(R.string.author31)));
        AutherListInfo.add(new Author("qht", activity.getResources().getString(R.string.author32)));
        AutherListInfo.add(new Author("mohna", activity.getResources().getString(R.string.author33)));
        AutherListInfo.add(new Author("kafi", activity.getResources().getString(R.string.author34)));
        AutherListInfo.add(new Author("tnjy", activity.getResources().getString(R.string.author35)));
        AutherListInfo.add(new Author("hamza", activity.getResources().getString(R.string.author36)));
        AutherListInfo.add(new Author("ifrad", activity.getResources().getString(R.string.author37)));
        AutherListInfo.add(new Author("zaki", activity.getResources().getString(R.string.author38)));
        AutherListInfo.add(new Author("sami_dosr", activity.getResources().getString(R.string.author39)));
        AutherListInfo.add(new Author("s_gmd", activity.getResources().getString(R.string.author40)));


        AutherListInfo.add(new Author("shur",activity.getResources().getString(R.string.author41)));
        AutherListInfo.add(new Author("shl", activity.getResources().getString(R.string.author42)));
        AutherListInfo.add(new Author("sayed", activity.getResources().getString(R.string.author43)));
        AutherListInfo.add(new Author("taher", activity.getResources().getString(R.string.author44)));
        AutherListInfo.add(new Author("hkm",activity.getResources().getString(R.string.author45)));
        AutherListInfo.add(new Author("sahood",activity.getResources().getString(R.string.author46)));
        AutherListInfo.add(new Author("s_bud",activity.getResources().getString(R.string.author47)));
        AutherListInfo.add(new Author("salah_hashim_m",activity.getResources().getString(R.string.author48)));
        AutherListInfo.add(new Author("bu_khtr", activity.getResources().getString(R.string.author49)));
        AutherListInfo.add(new Author("tareq", activity.getResources().getString(R.string.author50)));



        AutherListInfo.add(new Author("a_klb",activity.getResources().getString(R.string.author51)));
        AutherListInfo.add(new Author("ryan",activity.getResources().getString(R.string.author52)));
        AutherListInfo.add(new Author("thubti",activity.getResources().getString(R.string.author53)));
        AutherListInfo.add(new Author("bari",activity.getResources().getString(R.string.author54)));
        AutherListInfo.add(new Author("bari_molm", activity.getResources().getString(R.string.author55)));
        AutherListInfo.add(new Author("basit", activity.getResources().getString(R.string.author56)));
        AutherListInfo.add(new Author("basit_warsh",activity.getResources().getString(R.string.author57)));
        AutherListInfo.add(new Author("basit_mjwd", activity.getResources().getString(R.string.author58)));
        AutherListInfo.add(new Author("sds",activity.getResources().getString(R.string.author59)));
        AutherListInfo.add(new Author("soufi_klf",activity.getResources().getString(R.string.author60)));


        AutherListInfo.add(new Author("soufi",activity.getResources().getString(R.string.author61)));
        AutherListInfo.add(new Author("a_ahmed",activity.getResources().getString(R.string.author62)));
        AutherListInfo.add(new Author("brmi",activity.getResources().getString(R.string.author63)));
        AutherListInfo.add(new Author("Abdullahk",activity.getResources().getString(R.string.author64)));
        AutherListInfo.add(new Author("mtrod",activity.getResources().getString(R.string.author65)));
        AutherListInfo.add(new Author("bsfr",activity.getResources().getString(R.string.author66)));
        AutherListInfo.add(new Author("kyat",activity.getResources().getString(R.string.author67)));
        AutherListInfo.add(new Author("jhn", activity.getResources().getString(R.string.author68)));
        AutherListInfo.add(new Author("mohsin_harthi", activity.getResources().getString(R.string.author69)));
        AutherListInfo.add(new Author("obk",activity.getResources().getString(R.string.author70)));


        AutherListInfo.add(new Author("qasm", activity.getResources().getString(R.string.author71)));
        AutherListInfo.add(new Author("kanakeri",activity.getResources().getString(R.string.author72)));
        AutherListInfo.add(new Author("wdod",activity.getResources().getString(R.string.author73)));
        AutherListInfo.add(new Author("abo_hashim",activity.getResources().getString(R.string.author74)));
        AutherListInfo.add(new Author("huthifi_qalon",activity.getResources().getString(R.string.author75)));
        AutherListInfo.add(new Author("hthfi",activity.getResources().getString(R.string.author76)));
        AutherListInfo.add(new Author("a_jbr", activity.getResources().getString(R.string.author77)));
        AutherListInfo.add(new Author("hajjaj",activity.getResources().getString(R.string.author78)));
        AutherListInfo.add(new Author("hafz",activity.getResources().getString(R.string.author79)));
        AutherListInfo.add(new Author("frs_a",activity.getResources().getString(R.string.author80)));


        AutherListInfo.add(new Author("lafi",activity.getResources().getString(R.string.author81)));
        AutherListInfo.add(new Author("zaml",activity.getResources().getString(R.string.author82)));
        AutherListInfo.add(new Author("shaibat",activity.getResources().getString(R.string.author83)));
        AutherListInfo.add(new Author("maher_m", activity.getResources().getString(R.string.author84)));
        AutherListInfo.add(new Author("maher",activity.getResources().getString(R.string.author85)));
        AutherListInfo.add(new Author("shaksh",activity.getResources().getString(R.string.author86)));
        AutherListInfo.add(new Author("ayyub",activity.getResources().getString(R.string.author87)));
        AutherListInfo.add(new Author("braak",activity.getResources().getString(R.string.author88)));
        AutherListInfo.add(new Author("tblawi",activity.getResources().getString(R.string.author89)));
        AutherListInfo.add(new Author("mhsny",activity.getResources().getString(R.string.author90)));


        AutherListInfo.add(new Author("monshed",activity.getResources().getString(R.string.author91)));
        AutherListInfo.add(new Author("jbrl",activity.getResources().getString(R.string.author92)));
        AutherListInfo.add(new Author("rashad",activity.getResources().getString(R.string.author93)));
        AutherListInfo.add(new Author("shah",activity.getResources().getString(R.string.author94)));
        AutherListInfo.add(new Author("minsh",activity.getResources().getString(R.string.author95)));
        AutherListInfo.add(new Author("minsh_mjwd", activity.getResources().getString(R.string.author96)));
        AutherListInfo.add(new Author("abdullah_dori",activity.getResources().getString(R.string.author97)));
        AutherListInfo.add(new Author("khan",activity.getResources().getString(R.string.author98)));
        AutherListInfo.add(new Author("mrifai", activity.getResources().getString(R.string.author99)));
        AutherListInfo.add(new Author("sheimy",activity.getResources().getString(R.string.author100)));


        AutherListInfo.add(new Author("husr",activity.getResources().getString(R.string.author101)));

        AutherListInfo.add(new Author("bna_mjwd", activity.getResources().getString(R.string.author102)));

        AutherListInfo.add(new Author("afs",activity.getResources().getString(R.string.author103)));

        AutherListInfo.add(new Author("mustafa",activity.getResources().getString(R.string.author104)));

        AutherListInfo.add(new Author("lahoni",activity.getResources().getString(R.string.author105)));

        AutherListInfo.add(new Author("ra3ad",activity.getResources().getString(R.string.author106)));

        AutherListInfo.add(new Author("harthi",activity.getResources().getString(R.string.author107)));

        AutherListInfo.add(new Author("muftah_thakwan",activity.getResources().getString(R.string.author108)));

        AutherListInfo.add(new Author("bilal",activity.getResources().getString(R.string.author109)));

        AutherListInfo.add(new Author("qtm",activity.getResources().getString(R.string.author110)));

        AutherListInfo.add(new Author("nabil", activity.getResources().getString(R.string.author111)));
        AutherListInfo.add(new Author("namh", activity.getResources().getString(R.string.author112)));
        AutherListInfo.add(new Author("hani",activity.getResources().getString(R.string.author113)));
        AutherListInfo.add(new Author("waleed",activity.getResources().getString(R.string.author114)));
        AutherListInfo.add(new Author("yasser",activity.getResources().getString(R.string.author115)));
        AutherListInfo.add(new Author("qurashi", activity.getResources().getString(R.string.author116)));
        AutherListInfo.add(new Author("mzroyee",activity.getResources().getString(R.string.author117)));
        AutherListInfo.add(new Author("yahya",activity.getResources().getString(R.string.author118)));
        AutherListInfo.add(new Author("yousef", activity.getResources().getString(R.string.author119)));
        AutherListInfo.add(new Author("noah", activity.getResources().getString(R.string.author120)));

        return (AutherListInfo);

    }

    public String serverNumber(String EnglishName) {
        String ArabicName = "11";
        if (EnglishName.endsWith("shatri"))
            ArabicName = "11";
        if (EnglishName.endsWith("ahmad_huth"))
            ArabicName = "8";
        if (EnglishName.endsWith("hawashi"))
            ArabicName = "11";
        if (EnglishName.endsWith("trabulsi"))
            ArabicName = "10";
        if (EnglishName.endsWith("ajm"))
            ArabicName = "10";
        if (EnglishName.endsWith("trablsi"))
            ArabicName = "10";
        if (EnglishName.endsWith("saud"))
            ArabicName = "11";
        if (EnglishName.endsWith("saber"))
            ArabicName = "8";
        if (EnglishName.endsWith("Aamer"))
            ArabicName = "10";
        if (EnglishName.endsWith("ahmad_nu"))
            ArabicName = "11";
        if (EnglishName.endsWith("akil"))
            ArabicName = "12";
        if (EnglishName.endsWith("akrm"))
            ArabicName = "9";
        if (EnglishName.endsWith("akdr"))
            ArabicName = "6";
        if (EnglishName.endsWith("IbrahemSadan"))
            ArabicName = "10";
        if (EnglishName.endsWith("abkr"))
            ArabicName = "6";
        if (EnglishName.endsWith("jbreen"))
            ArabicName = "6";
        if (EnglishName.endsWith("jormy"))
            ArabicName = "11";
        if (EnglishName.endsWith("ibrahim_dosri_warsh"))
            ArabicName = "10";
        if (EnglishName.endsWith("3siri"))
            ArabicName = "6";
        if (EnglishName.endsWith("zamri"))
            ArabicName = "12";
        if (EnglishName.endsWith("3zazi"))
            ArabicName = "8";
        if (EnglishName.endsWith("dokali"))
            ArabicName = "7";
        if (EnglishName.endsWith("alzain"))
            ArabicName = "9";
        if (EnglishName.endsWith("omran"))
            ArabicName = "9";
        if (EnglishName.endsWith("koshi"))
            ArabicName = "11";
        if (EnglishName.endsWith("fateh"))
            ArabicName = "6";
        if (EnglishName.endsWith("qari"))
            ArabicName = "11";
        if (EnglishName.endsWith("twfeeq"))
            ArabicName = "6";
        if (EnglishName.endsWith("jamal"))
            ArabicName = "6";
        if (EnglishName.endsWith("jaman"))
            ArabicName = "6";
        if (EnglishName.endsWith("hatem"))
            ArabicName = "11";
        if (EnglishName.endsWith("qht"))
            ArabicName = "10";
        if (EnglishName.endsWith("mohna"))
            ArabicName = "11";
        if (EnglishName.endsWith("kafi"))
            ArabicName = "11";
        if (EnglishName.endsWith("tnjy"))
            ArabicName = "12";
        if (EnglishName.endsWith("hamza"))
            ArabicName = "9";
        if (EnglishName.endsWith("ifrad"))
            ArabicName = "12";
        if (EnglishName.endsWith("zaki"))
            ArabicName = "9";
        if (EnglishName.endsWith("sami_dosr"))
            ArabicName = "8";
        if (EnglishName.endsWith("s_gmd"))
            ArabicName = "7";
        if (EnglishName.endsWith("shur"))
            ArabicName = "7";
        if (EnglishName.endsWith("shl"))
            ArabicName = "6";
        if (EnglishName.endsWith("sayed"))
            ArabicName = "12";
        if (EnglishName.endsWith("taher"))
            ArabicName = "12";
        if (EnglishName.endsWith("hkm"))
            ArabicName = "12";
        if (EnglishName.endsWith("sahood"))
            ArabicName = "8";
        if (EnglishName.endsWith("s_bud"))
            ArabicName = "6";
        if (EnglishName.endsWith("salah_hashim_m"))
            ArabicName = "12";
        if (EnglishName.endsWith("bu_khtr"))
            ArabicName = "8";
        if (EnglishName.endsWith("tareq"))
            ArabicName = "10";
        if (EnglishName.endsWith("a_klb"))
            ArabicName = "8";
        if (EnglishName.endsWith("ryan"))
            ArabicName = "8";
        if (EnglishName.endsWith("thubti"))
            ArabicName = "6";
        if (EnglishName.endsWith("bari"))
            ArabicName = "12";
        if (EnglishName.endsWith("bari_molm"))
            ArabicName = "10";
        if (EnglishName.endsWith("basit"))
            ArabicName = "7";
        if (EnglishName.endsWith("basit_warsh"))
            ArabicName = "10";
        if (EnglishName.endsWith("basit_mjwd"))
            ArabicName = "13";
        if (EnglishName.endsWith("sds"))
            ArabicName = "11";
        if (EnglishName.endsWith("soufi_klf"))
            ArabicName = "9";
        if (EnglishName.endsWith("soufi"))
            ArabicName = "9";
        if (EnglishName.endsWith("a_ahmed"))
            ArabicName = "11";
        if (EnglishName.endsWith("brmi"))
            ArabicName = "8";
        if (EnglishName.endsWith("Abdullahk"))
            ArabicName = "10";
        if (EnglishName.endsWith("mtrod"))
            ArabicName = "8";
        if (EnglishName.endsWith("bsfr"))
            ArabicName = "6";
        if (EnglishName.endsWith("kyat"))
            ArabicName = "12";
        if (EnglishName.endsWith("jhn"))
            ArabicName = "13";
        if (EnglishName.endsWith("mohsin_harthi"))
            ArabicName = "6";
        if (EnglishName.endsWith("obk"))
            ArabicName = "12";
        if (EnglishName.endsWith("qasm"))
            ArabicName = "8";
        if (EnglishName.endsWith("kanakeri"))
            ArabicName = "6";
        if (EnglishName.endsWith("wdod"))
            ArabicName = "8";
        if (EnglishName.endsWith("abo_hashim"))
            ArabicName = "9";
        if (EnglishName.endsWith("huthifi_qalon"))
            ArabicName = "9";
        if (EnglishName.endsWith("hthfi"))
            ArabicName = "9";
        if (EnglishName.endsWith("a_jbr"))
            ArabicName = "11";
        if (EnglishName.endsWith("hajjaj"))
            ArabicName = "9";
        if (EnglishName.endsWith("hafz"))
            ArabicName = "6";
        if (EnglishName.endsWith("frs_a"))
            ArabicName = "8";
        if (EnglishName.endsWith("lafi"))
            ArabicName = "6";
        if (EnglishName.endsWith("zaml"))
            ArabicName = "9";
        if (EnglishName.endsWith("shaibat"))
            ArabicName = "9";
        if (EnglishName.endsWith("maher_m"))
            ArabicName = "12";
        if (EnglishName.endsWith("maher"))
            ArabicName = "12";
        if (EnglishName.endsWith("shaksh"))
            ArabicName = "10";
        if (EnglishName.endsWith("ayyub"))
            ArabicName = "8";
        if (EnglishName.endsWith("braak"))
            ArabicName = "13";
        if (EnglishName.endsWith("tblawi"))
            ArabicName = "12";
        if (EnglishName.endsWith("mhsny"))
            ArabicName = "11";
        if (EnglishName.endsWith("monshed"))
            ArabicName = "10";
        if (EnglishName.endsWith("jbrl"))
            ArabicName = "8";
        if (EnglishName.endsWith("rashad"))
            ArabicName = "10";
        if (EnglishName.endsWith("shah"))
            ArabicName = "12";
        if (EnglishName.endsWith("minsh"))
            ArabicName = "10";
        if (EnglishName.endsWith("minsh_mjwd"))
            ArabicName = "11";
        if (EnglishName.endsWith("abdullah_dori"))
            ArabicName = "12";
        if (EnglishName.endsWith("khan"))
            ArabicName = "6";
        if (EnglishName.endsWith("mrifai"))
            ArabicName = "11";
        if (EnglishName.endsWith("sheimy"))
            ArabicName = "10";
        if (EnglishName.endsWith("husr"))
            ArabicName = "13";
        if (EnglishName.endsWith("bna_mjwd"))
            ArabicName = "8";
        if (EnglishName.endsWith("afs"))
            ArabicName = "8";
        if (EnglishName.endsWith("mustafa"))
            ArabicName = "8";
        if (EnglishName.endsWith("lahoni"))
            ArabicName = "6";
        if (EnglishName.endsWith("ra3ad"))
            ArabicName = "8";
        if (EnglishName.endsWith("harthi"))
            ArabicName = "8";
        if (EnglishName.endsWith("muftah_thakwan"))
            ArabicName = "11";
        if (EnglishName.endsWith("bilal"))
            ArabicName = "11";
        if (EnglishName.endsWith("qtm"))
            ArabicName = "6";
        if (EnglishName.endsWith("nabil"))
            ArabicName = "9";
        if (EnglishName.endsWith("namh"))
            ArabicName = "8";
        if (EnglishName.endsWith("hani"))
            ArabicName = "8";
        if (EnglishName.endsWith("waleed"))
            ArabicName = "9";
        if (EnglishName.endsWith("yasser"))
            ArabicName = "11";
        if (EnglishName.endsWith("qurashi"))
            ArabicName = "9";
        if (EnglishName.endsWith("mzroyee"))
            ArabicName = "9";
        if (EnglishName.endsWith("yahya"))
            ArabicName = "12";
        if (EnglishName.endsWith("yousef"))
            ArabicName = "9";
        if (EnglishName.endsWith("noah"))
            ArabicName = "8";
        if (EnglishName.endsWith("shatri"))
            ArabicName = "11";
        if (EnglishName.endsWith("ahmad_huth"))
            ArabicName = "8";
        if (EnglishName.endsWith("hawashi"))
            ArabicName = "11";
        if (EnglishName.endsWith("trabulsi"))
            ArabicName = "10";
        if (EnglishName.endsWith("ajm"))
            ArabicName = "10";
        if (EnglishName.endsWith("trablsi"))
            ArabicName = "10";
        if (EnglishName.endsWith("saud"))
            ArabicName = "11";
        if (EnglishName.endsWith("saber"))
            ArabicName = "8";
        if (EnglishName.endsWith("Aamer"))
            ArabicName = "10";
        if (EnglishName.endsWith("ahmad_nu"))
            ArabicName = "11";
        if (EnglishName.endsWith("akil"))
            ArabicName = "12";
        if (EnglishName.endsWith("akrm"))
            ArabicName = "9";
        if (EnglishName.endsWith("akdr"))
            ArabicName = "6";
        if (EnglishName.endsWith("IbrahemSadan"))
            ArabicName = "10";
        if (EnglishName.endsWith("abkr"))
            ArabicName = "6";
        if (EnglishName.endsWith("jbreen"))
            ArabicName = "6";
        if (EnglishName.endsWith("jormy"))
            ArabicName = "11";
        if (EnglishName.endsWith("ibrahim_dosri_warsh"))
            ArabicName = "10";
        if (EnglishName.endsWith("3siri"))
            ArabicName = "6";
        if (EnglishName.endsWith("zamri"))
            ArabicName = "12";
        if (EnglishName.endsWith("3zazi"))
            ArabicName = "8";
        if (EnglishName.endsWith("dokali"))
            ArabicName = "7";
        if (EnglishName.endsWith("alzain"))
            ArabicName = "9";
        if (EnglishName.endsWith("omran"))
            ArabicName = "9";
        if (EnglishName.endsWith("koshi"))
            ArabicName = "11";
        if (EnglishName.endsWith("fateh"))
            ArabicName = "6";
        if (EnglishName.endsWith("qari"))
            ArabicName = "11";
        if (EnglishName.endsWith("twfeeq"))
            ArabicName = "6";
        if (EnglishName.endsWith("jamal"))
            ArabicName = "6";
        if (EnglishName.endsWith("jaman"))
            ArabicName = "6";
        if (EnglishName.endsWith("hatem"))
            ArabicName = "11";
        if (EnglishName.endsWith("qht"))
            ArabicName = "10";
        if (EnglishName.endsWith("mohna"))
            ArabicName = "11";
        if (EnglishName.endsWith("kafi"))
            ArabicName = "11";
        if (EnglishName.endsWith("tnjy"))
            ArabicName = "12";
        if (EnglishName.endsWith("hamza"))
            ArabicName = "9";
        if (EnglishName.endsWith("ifrad"))
            ArabicName = "12";
        if (EnglishName.endsWith("zaki"))
            ArabicName = "9";
        if (EnglishName.endsWith("sami_dosr"))
            ArabicName = "8";
        if (EnglishName.endsWith("s_gmd"))
            ArabicName = "7";
        if (EnglishName.endsWith("shur"))
            ArabicName = "7";
        if (EnglishName.endsWith("shl"))
            ArabicName = "6";
        if (EnglishName.endsWith("sayed"))
            ArabicName = "12";
        if (EnglishName.endsWith("taher"))
            ArabicName = "12";
        if (EnglishName.endsWith("hkm"))
            ArabicName = "12";
        if (EnglishName.endsWith("sahood"))
            ArabicName = "8";
        if (EnglishName.endsWith("s_bud"))
            ArabicName = "6";
        if (EnglishName.endsWith("salah_hashim_m"))
            ArabicName = "12";
        if (EnglishName.endsWith("bu_khtr"))
            ArabicName = "8";
        if (EnglishName.endsWith("tareq"))
            ArabicName = "10";
        if (EnglishName.endsWith("a_klb"))
            ArabicName = "8";
        if (EnglishName.endsWith("ryan"))
            ArabicName = "8";
        if (EnglishName.endsWith("thubti"))
            ArabicName = "6";
        if (EnglishName.endsWith("bari"))
            ArabicName = "12";
        if (EnglishName.endsWith("bari_molm"))
            ArabicName = "10";
        if (EnglishName.endsWith("basit"))
            ArabicName = "7";
        if (EnglishName.endsWith("basit_warsh"))
            ArabicName = "10";
        if (EnglishName.endsWith("basit_mjwd"))
            ArabicName = "13";
        if (EnglishName.endsWith("sds"))
            ArabicName = "11";
        if (EnglishName.endsWith("soufi_klf"))
            ArabicName = "9";
        if (EnglishName.endsWith("soufi"))
            ArabicName = "9";
        if (EnglishName.endsWith("a_ahmed"))
            ArabicName = "11";
        if (EnglishName.endsWith("brmi"))
            ArabicName = "8";
        if (EnglishName.endsWith("Abdullahk"))
            ArabicName = "10";
        if (EnglishName.endsWith("mtrod"))
            ArabicName = "8";
        if (EnglishName.endsWith("bsfr"))
            ArabicName = "6";
        if (EnglishName.endsWith("kyat"))
            ArabicName = "12";
        if (EnglishName.endsWith("jhn"))
            ArabicName = "13";
        if (EnglishName.endsWith("mohsin_harthi"))
            ArabicName = "6";
        if (EnglishName.endsWith("obk"))
            ArabicName = "12";
        if (EnglishName.endsWith("qasm"))
            ArabicName = "8";
        if (EnglishName.endsWith("kanakeri"))
            ArabicName = "6";
        if (EnglishName.endsWith("wdod"))
            ArabicName = "8";
        if (EnglishName.endsWith("abo_hashim"))
            ArabicName = "9";
        if (EnglishName.endsWith("huthifi_qalon"))
            ArabicName = "9";
        if (EnglishName.endsWith("hthfi"))
            ArabicName = "9";
        if (EnglishName.endsWith("a_jbr"))
            ArabicName = "11";
        if (EnglishName.endsWith("hajjaj"))
            ArabicName = "9";
        if (EnglishName.endsWith("hafz"))
            ArabicName = "6";
        if (EnglishName.endsWith("frs_a"))
            ArabicName = "8";
        if (EnglishName.endsWith("lafi"))
            ArabicName = "6";
        if (EnglishName.endsWith("zaml"))
            ArabicName = "9";
        if (EnglishName.endsWith("shaibat"))
            ArabicName = "9";
        if (EnglishName.endsWith("maher_m"))
            ArabicName = "12";
        if (EnglishName.endsWith("maher"))
            ArabicName = "12";
        if (EnglishName.endsWith("shaksh"))
            ArabicName = "10";
        if (EnglishName.endsWith("ayyub"))
            ArabicName = "8";
        if (EnglishName.endsWith("braak"))
            ArabicName = "13";
        if (EnglishName.endsWith("tblawi"))
            ArabicName = "12";
        if (EnglishName.endsWith("mhsny"))
            ArabicName = "11";
        if (EnglishName.endsWith("monshed"))
            ArabicName = "10";
        if (EnglishName.endsWith("jbrl"))
            ArabicName = "8";
        if (EnglishName.endsWith("rashad"))
            ArabicName = "10";
        if (EnglishName.endsWith("shah"))
            ArabicName = "12";
        if (EnglishName.endsWith("minsh"))
            ArabicName = "10";
        if (EnglishName.endsWith("minsh_mjwd"))
            ArabicName = "11";
        if (EnglishName.endsWith("abdullah_dori"))
            ArabicName = "12";
        if (EnglishName.endsWith("khan"))
            ArabicName = "6";
        if (EnglishName.endsWith("mrifai"))
            ArabicName = "11";
        if (EnglishName.endsWith("sheimy"))
            ArabicName = "10";
        if (EnglishName.endsWith("husr"))
            ArabicName = "13";
        if (EnglishName.endsWith("bna_mjwd"))
            ArabicName = "8";
        if (EnglishName.endsWith("afs"))
            ArabicName = "8";
        if (EnglishName.endsWith("mustafa"))
            ArabicName = "8";
        if (EnglishName.endsWith("lahoni"))
            ArabicName = "6";
        if (EnglishName.endsWith("ra3ad"))
            ArabicName = "8";
        if (EnglishName.endsWith("harthi"))
            ArabicName = "8";
        if (EnglishName.endsWith("muftah_thakwan"))
            ArabicName = "11";
        if (EnglishName.endsWith("bilal"))
            ArabicName = "11";
        if (EnglishName.endsWith("qtm"))
            ArabicName = "6";
        if (EnglishName.endsWith("nabil"))
            ArabicName = "9";
        if (EnglishName.endsWith("namh"))
            ArabicName = "8";
        if (EnglishName.endsWith("hani"))
            ArabicName = "8";
        if (EnglishName.endsWith("waleed"))
            ArabicName = "9";
        if (EnglishName.endsWith("yasser"))
            ArabicName = "11";
        if (EnglishName.endsWith("qurashi"))
            ArabicName = "9";
        if (EnglishName.endsWith("mzroyee"))
            ArabicName = "9";
        if (EnglishName.endsWith("yahya"))
            ArabicName = "12";
        if (EnglishName.endsWith("yousef"))
            ArabicName = "9";
        if (EnglishName.endsWith("noah"))
            ArabicName = "8";
        return ArabicName;


    }

    public ArrayList<Author> GuranAya(String ReciteName) {
        ListAya.clear();
        ListAya.add(new Author("001", " الفاتحة"));
        ListAya.add(new Author("002", "البقرة"));
        ListAya.add(new Author("003", "ال عمران "));
        ListAya.add(new Author("004", "النساء"));
        ListAya.add(new Author("005", " المائدة"));
        ListAya.add(new Author("006", " الانعام"));
        ListAya.add(new Author("007", " الأعراف"));
        ListAya.add(new Author("008", " الأنفال"));
        ListAya.add(new Author("009", " التوبة "));
        ListAya.add(new Author("010", " يونس"));
        ListAya.add(new Author("011", " هود"));
        ListAya.add(new Author("012", " يوسف"));
        ListAya.add(new Author("013", " الرعد"));
        ListAya.add(new Author("014", " إبراهيم"));
        ListAya.add(new Author("015", " الحجر"));
        ListAya.add(new Author("016", " النحل"));
        ListAya.add(new Author("017", " الإسراء"));
        ListAya.add(new Author("018", " الكهف"));
        ListAya.add(new Author("019", " مريم"));
        ListAya.add(new Author("020", " طه"));
        ListAya.add(new Author("021", " الأنبياء"));
        ListAya.add(new Author("022", " الحج"));
        ListAya.add(new Author("023", " المؤمنون"));
        ListAya.add(new Author("024", " النّور"));
        ListAya.add(new Author("025", "  الفرقان "));
        ListAya.add(new Author("026", "  الشعراء "));
        ListAya.add(new Author("027", " النّمل"));
        ListAya.add(new Author("028", " القصص"));
        ListAya.add(new Author("029", " العنكبوت"));
        ListAya.add(new Author("030", " الرّوم"));
        ListAya.add(new Author("031", " لقمان"));
        ListAya.add(new Author("032", " السجدة"));
        ListAya.add(new Author("033", " الأحزاب"));
        ListAya.add(new Author("034", " سبأ"));
        ListAya.add(new Author("035", " فاطر"));
        ListAya.add(new Author("036", " يس"));
        ListAya.add(new Author("037", " الصافات"));
        ListAya.add(new Author("038", " ص"));
        ListAya.add(new Author("039", " الزمر"));
        ListAya.add(new Author("040", " غافر"));
        ListAya.add(new Author("041", " فصّلت"));
        ListAya.add(new Author("042", " الشورى"));
        ListAya.add(new Author("043", " الزخرف"));
        ListAya.add(new Author("044", " الدّخان"));
        ListAya.add(new Author("045", " الجاثية"));
        ListAya.add(new Author("046", " الأحقاف"));
        ListAya.add(new Author("047", " محمد"));
        ListAya.add(new Author("048", " الفتح"));
        ListAya.add(new Author("049", " الحجرات"));
        ListAya.add(new Author("050", " ق"));
        ListAya.add(new Author("051", " الذاريات"));
        ListAya.add(new Author("052", " الطور"));
        ListAya.add(new Author("053", " النجم"));
        ListAya.add(new Author("054", " القمر"));
        ListAya.add(new Author("055", " الرحمن"));
        ListAya.add(new Author("056", " الواقعة"));
        ListAya.add(new Author("057", " الحديد"));
        ListAya.add(new Author("058", " المجادلة"));
        ListAya.add(new Author("059", " الحشر"));
        ListAya.add(new Author("060", " الممتحنة"));
        ListAya.add(new Author("061", " الصف"));
        ListAya.add(new Author("062", " الجمعة"));
        ListAya.add(new Author("063", " المنافقون"));
        ListAya.add(new Author("064", " التغابن"));
        ListAya.add(new Author("065", " الطلاق"));
        ListAya.add(new Author("066", " التحريم"));
        ListAya.add(new Author("067", " الملك"));
        ListAya.add(new Author("068", " القلم"));
        ListAya.add(new Author("069", " الحاقة"));
        ListAya.add(new Author("070", " المعارج"));
        ListAya.add(new Author("071", " نوح"));
        ListAya.add(new Author("072", " الجن"));
        ListAya.add(new Author("073", " المزّمّل"));
        ListAya.add(new Author("074", " المدّثر"));
        ListAya.add(new Author("075", " القيامة"));
        ListAya.add(new Author("076", " الإنسان"));
        ListAya.add(new Author("077", " المرسلات"));
        ListAya.add(new Author("078", " النبأ"));
        ListAya.add(new Author("079", " النازعات"));
        ListAya.add(new Author("080", " عبس"));
        ListAya.add(new Author("081", " التكوير"));
        ListAya.add(new Author("082", " الإنفطار"));
        ListAya.add(new Author("083", " المطفّفين"));
        ListAya.add(new Author("084", " الإنشقاق"));
        ListAya.add(new Author("085", " البروج"));
        ListAya.add(new Author("086", " الطارق"));
        ListAya.add(new Author("087", " الأعلى"));
        ListAya.add(new Author("088", " الغاشية"));
        ListAya.add(new Author("089", " الفجر"));
        ListAya.add(new Author("090", " البلد"));
        ListAya.add(new Author("091", " الشمس"));
        ListAya.add(new Author("092", " الليل"));
        ListAya.add(new Author("093", " الضحى"));
        ListAya.add(new Author("094", " الشرح"));
        ListAya.add(new Author("095", " التين"));
        ListAya.add(new Author("096", " العلق"));
        ListAya.add(new Author("097", " القدر"));
        ListAya.add(new Author("098", " البينة"));
        ListAya.add(new Author("099", " الزلزلة"));
        ListAya.add(new Author("100", " العاديات"));
        ListAya.add(new Author("101", " القارعة"));
        ListAya.add(new Author("102", " التكاثر"));
        ListAya.add(new Author("103", " العصر"));
        ListAya.add(new Author("104", " الهمزة"));
        ListAya.add(new Author("105", " الفيل"));
        ListAya.add(new Author("106", " قريش"));
        ListAya.add(new Author("107", " الماعون"));
        ListAya.add(new Author("108", " الكوثر"));
        ListAya.add(new Author("109", " الكافرون"));
        ListAya.add(new Author("110", " النصر"));
        ListAya.add(new Author("111", " المسد"));
        ListAya.add(new Author("112", " الإخلاص"));
        ListAya.add(new Author("113", " الفلق"));
        ListAya.add(new Author("114", " النّاس"));

        ListBeginEndAya ListRange = new ListBeginEndAya();
        ListRange = Managment.autherRanageDetermine(ReciteName);
        ListAyaRanage.clear();
        String AYAPAth;
        for (int i = ListRange.beginR; i < ListRange.endread; i++) {
            try {
                Author ac = new Author();
                ac = ListAya.get(i);
                String SDPath = Environment.getExternalStorageDirectory().getPath() + "/";
                AYAPAth = SDPath + ReciteName + ac.ServerName + ".mp3";
                File myFile = new File(AYAPAth);
                if (myFile.exists())
                    ListAyaRanage.add(new Author(ac.ServerName, ac.RealName, avalible(), AYAPAth));
                else {
                    AYAPAth = "http://server" + serverNumber(ReciteName) + ".mp3quran.net/" + ReciteName + "/" + ac.ServerName + ".mp3";
                    ListAyaRanage.add(new Author(ac.ServerName, ac.RealName, disavalible(), AYAPAth));
                }
            } catch (Exception ex) {
            }
        }
        return (ListAyaRanage);
    }


}

