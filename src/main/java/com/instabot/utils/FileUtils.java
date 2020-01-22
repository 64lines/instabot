package com.instabot.utils;

import static java.util.Arrays.asList;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.apache.commons.io.FilenameUtils;

public class FileUtils
{
    /**
     * Get files from an specified directory.
     *
     * @param directory
     * @return list of files
     */
    public static List<String> getPictures(String directory)
    {
        List<String> allowedExtensions = Arrays.asList("jpg", "jpeg");
        File folder = new File(directory);

        List<String> listFiles = Arrays.asList(folder.listFiles()).stream()
            .map(file -> file.getAbsolutePath())
            .filter(file -> allowedExtensions.contains(FilenameUtils.getExtension(file)))
            .collect(Collectors.toList());

        return listFiles;
    }
}
