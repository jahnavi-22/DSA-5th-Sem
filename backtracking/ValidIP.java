package backtracking;

import java.util.*;

class ValidIP {
    List<String> res = new ArrayList<>();
    List<String> segment = new ArrayList<>();
    boolean foundValidAddress = false; // Added a flag to track if a valid address is found

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, segment, res);
        if (!foundValidAddress) {
            res.add("No valid address");
        }
        return res;
    }

    public void backtrack(String s, int idx, List<String> segments, List<String> res) {
        if (segments.size() == 4 && idx == s.length()) {
            res.add(String.join(".", segments));
            foundValidAddress = true; // Set the flag to true when a valid address is found
            return;
        }

        if (segments.size() < 4 && idx < s.length()) {

            for (int i = 1; i <= 3 && idx + i <= s.length(); i++) {
                String seg = s.substring(idx, idx + i);
                if (isValid(seg)) {
                    segments.add(seg);
                    backtrack(s, idx + i, segments, res);
                    segments.remove(segments.size() - 1);
                }
            }
        }
    }

    public boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int val = Integer.parseInt(s);
        return val >= 0 && val <= 255;
    }

    public static void main(String[] args) {
        ValidIP s = new ValidIP();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Address String : ");
        String input_str = in.next();
        List<String> valid_id = s.restoreIpAddresses(input_str);
        for (String id : valid_id) {
            System.out.println(id);
        }
    }
}