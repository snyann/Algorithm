class Solution {
    public String solution(String new_id) {
        // 1단계: 소문자로 변환
        new_id = new_id.toLowerCase();

        // 2단계: 허용된 문자 이외의 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3단계: 연속된 마침표(.)를 하나의 마침표로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");

        // 4단계: 처음과 끝에 위치한 마침표(.) 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");

        // 5단계: 빈 문자열인 경우 "a" 대입
        if (new_id.isEmpty()) {
            new_id = "a";
        }

        // 6단계: 길이가 16자 이상이면 15자로 줄임, 끝에 위치한 마침표(.) 제거
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        }

        // 7단계: 길이가 2자 이하면 마지막 문자를 반복해서 붙임
        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}