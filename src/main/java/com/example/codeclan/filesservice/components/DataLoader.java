package com.example.codeclan.filesservice.components;

import com.example.codeclan.filesservice.models.File;
import com.example.codeclan.filesservice.models.Folder;
import com.example.codeclan.filesservice.models.User;
import com.example.codeclan.filesservice.repositories.FileRepository;
import com.example.codeclan.filesservice.repositories.FolderRepository;
import com.example.codeclan.filesservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User userOne = new User("Steven");
        userRepository.save(userOne);
        User userTwo = new User("Sally");
        userRepository.save(userTwo);

        Folder folderOne = new Folder("1st Folder", userOne);
        folderRepository.save(folderOne);
        Folder folderTwo = new Folder("2nd Folder", userTwo);
        folderRepository.save(folderTwo);
        Folder folderThree = new Folder("3rd Folder", userOne);
        folderRepository.save(folderThree);
        Folder folderFour = new Folder("4th Folder", userTwo);
        folderRepository.save(folderFour);

        File fileOne = new File("1st File", "TXT", 5, folderOne);
        fileRepository.save(fileOne);
        File fileTwo = new File ("2nd File", "JPEG", 10, folderTwo);
        fileRepository.save(fileTwo);
        File fileThree = new File ("3rd File", "MP3", 23, folderThree);
        fileRepository.save(fileThree);
        File fileFour = new File ("4th File", "JAVA", 50, folderFour);
        fileRepository.save(fileFour);
        File fileFive = new File ("5th File", "Node", 80, folderOne);
        fileRepository.save(fileFive);
        File fileSix = new File ("6th File", "HTML", 108, folderTwo);
        fileRepository.save(fileSix);
        File fileSeven = new File ("7th File", "XML", 205, folderThree);
        fileRepository.save(fileSeven);
        File fileEight = new File ("8th File", "APP", 405, folderFour);
        fileRepository.save(fileEight);

    }

}

