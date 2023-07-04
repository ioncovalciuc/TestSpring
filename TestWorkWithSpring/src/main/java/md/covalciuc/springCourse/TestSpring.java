package md.covalciuc.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Music music=context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer=new MusicPlayer(music);
//        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        Music music=context.getBean("rockMusic",Music.class);
//        MusicPlayer musicPlayer=new MusicPlayer(music);
//        musicPlayer.playMusic();
//        Music music1=context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer1=new MusicPlayer(music1);
//        musicPlayer1.playMusic();
//        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer=context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        ClassicalMusic classicalMusic1=context.getBean("classicalMusic",ClassicalMusic.class);


        System.out.println(classicalMusic1);
        context.close();
    }
}
