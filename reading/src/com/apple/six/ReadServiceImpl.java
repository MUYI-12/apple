package com.apple.six;

public class ReadServiceImpl implements ReadingService {

    @Override
    public void showRead() {
        System.out.println("输出信息：");
        Note note = new Note("23","6");
        System.out.println(note.toString());

        Magazine magazine = new Magazine("34","10","2019-10-1");
        System.out.println(magazine.toString());

        Qikan qikan = new Qikan("30","10","2019-10-2");
        System.out.println(qikan.toString());

        Booking booking = new Booking("42","40","java语言");
        System.out.println(booking.toString());

    }
}
