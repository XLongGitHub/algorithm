package newke.retest;

import java.util.*;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new LinkedList();

        int n = sc.nextInt();
        String[] proxiedIP = new String[n];
        for (int i = 0; i < n; i++) {
            proxiedIP[i] = sc.next();
            map.put(proxiedIP[i], 0);
        }
        int m = sc.nextInt();
        String[] realIP = new String[m];
        for (int i = 0; i < m; i++) {
            realIP[i] = sc.next();
        }
        if (proxiedIP.length + realIP.length != m + n)
            System.out.println(-1);
            System.exit(0);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!proxiedIP[j].equals(realIP[i]) && map.containsKey(proxiedIP[j])) {
                    map.put(proxiedIP[j], map.get(proxiedIP[j]) + 1);
                } else if (map.containsKey(proxiedIP[j])){
                    map.remove(proxiedIP[j]);
                }
                if (map.size() == 1) {
                    Set set = map.entrySet();
                    Iterator iterator = set.iterator();
                    Map.Entry mapEntry = (Map.Entry) iterator.next();

                    if (list.isEmpty()) {
                        list.add((String) mapEntry.getKey());
                    } else if (list.get(list.size() -1 ).equals(mapEntry.getKey())) {
                        list.add((String) mapEntry.getKey());
                    }
                }
            }
            if (map.size() == 0) {
                for (int k = 0; k < n; k++) {
                    map.put(proxiedIP[k], 0);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < list.size() -1; i++) {
            if (list.get(i).equals(list.get(i + 1)))
                count++;
        }
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(count);
    }
}


/**
 * 2
 166.111.4.100
 162.105.131.113
 4
 72.14.235.104
 166.111.4.100
 202.112.128.69
 162.105.131.113
 */
