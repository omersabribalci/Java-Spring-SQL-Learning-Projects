package com.workintech.sqldmljoins.repository;

import com.workintech.sqldmljoins.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OgrenciRepository extends JpaRepository<Ogrenci, Long> {


    //Kitap alan öğrencilerin öğrenci bilgilerini listeleyin..
    String QUESTION_2 = "SELECT \n" +
            "o.ogrno," +
            "o.ad, o.soyad," +
            "o.cinsiyet," +
            "o.sinif," +
            "o.puan," +
            "o.dtarih\n" +
            "FROM ogrenci as o\n" +
            "join islem as i\n" +
            "on o.ogrno = i.ogrno";
    @Query(value = QUESTION_2, nativeQuery = true)
    List<Ogrenci> findStudentsWithBook();

    //Kitap almayan öğrencileri listeleyin.
    String QUESTION_3 = "SELECT o.ogrno," +
            "o.ad," +
            "o.soyad," +
            "o.cinsiyet," +
            "o.sinif," +
            "o.puan," +
            "o.dtarih\n" +
            "FROM ogrenci as o\n" +
            "left join islem as i\n" +
            "on o.ogrno = i.ogrno\n" +
            "where i.ogrno IS NULL";
    @Query(value = QUESTION_3, nativeQuery = true)
    List<Ogrenci> findStudentsWithNoBook();

    //10A veya 10B sınıfındaki öğrencileri sınıf ve okuduğu kitap sayısını getirin.
    String QUESTION_4 = "select o.sinif, count(i.islemno) from ogrenci as o\n" +
            "join islem as i\n" +
            "on o.ogrno = i.ogrno\n" +
            "where o.sinif in ('10A', '10B')\n" +
            "group by o.sinif";
    @Query(value = QUESTION_4, nativeQuery = true)
    List<KitapCount> findClassesWithBookCount();

    //Öğrenci tablosundaki öğrenci sayısını gösterin
    String QUESTION_5 = "select count(*) from ogrenci";
    @Query(value = QUESTION_5, nativeQuery = true)
    Integer findStudentCount();

    //Öğrenci tablosunda kaç farklı isimde öğrenci olduğunu listeleyiniz.
    String QUESTION_6 = "select count(distinct ad) from ogrenci";
    @Query(value = QUESTION_6, nativeQuery = true)
    Integer findUniqueStudentNameCount();

    //--İsme göre öğrenci sayılarının adedini bulunuz.
    //--Ali: 2, Mehmet: 3
    String QUESTION_7 = "SELECT ad, count(*) FROM ogrenci\n" +
            "group by ad\n";
    @Query(value = QUESTION_7, nativeQuery = true)
    List<StudentNameCount> findStudentNameCount();


    String QUESTION_8 = "select sinif, count(*) from ogrenci\n" +
            "group by sinif";
    @Query(value = QUESTION_8, nativeQuery = true)
    List<StudentClassCount> findStudentClassCount();

    String QUESTION_9 = "select o.ad, o.soyad, count(i.islemno) from ogrenci as o\n" +
            "join islem as i\n" +
            "on o.ogrno = i.ogrno\n" +
            "group by o.ad, o.soyad";
    @Query(value = QUESTION_9, nativeQuery = true)
    List<StudentNameSurnameCount> findStudentNameSurnameCount();
}
