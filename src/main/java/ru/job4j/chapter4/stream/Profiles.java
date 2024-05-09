package ru.job4j.chapter4.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .collect(Collectors.toList());
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        List<Address> addresses = collect(profiles);
        Comparator<Address> comparator =  new Comparator<Address>() {
            @Override
            public int compare(Address left, Address right) {
                return left.getCity().compareTo(right.getCity());
            }
        };
        addresses.sort(comparator);
        return addresses.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
