package ch06Class;

public class C01dsfasfd {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String pk[] ={"OSO", "OOO", "OXO", "OOO"};
        String rt[] ={"E 2", "S 3", "W 1"};
        int[] result = solution.solution(pk, rt);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int H = park.length;
        int W = park[0].length();

        // 시작 위치 찾기
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        int y = answer[0]; // 세로 방향 좌표
        int x = answer[1]; // 가로 방향 좌표

        for (String route : routes) {
            String[] splitRoute = route.split(" ");
            char direction = splitRoute[0].charAt(0);
            int distance = Integer.parseInt(splitRoute[1]);
            int tempY = y, tempX = x;

            for (int i = 0; i < distance; i++) {
                if (direction == 'N' && tempY > 0 && park[tempY-1].charAt(tempX) != 'X') {
                    tempY--;
                } else if (direction == 'S' && tempY < H - 1 && park[tempY+1].charAt(tempX) != 'X') {
                    tempY++;
                } else if (direction == 'E' && tempX < W - 1 && park[tempY].charAt(tempX+1) != 'X') {
                    tempX++;
                } else if (direction == 'W' && tempX > 0 && park[tempY].charAt(tempX-1) != 'X') {
                    tempX--;
                } else {
                    break;
                }
            }
            // 장애물을 만나지 않고 전체 거리를 이동했으면 최종 위치 업데이트
            if(distance == Math.abs(tempY - y) + Math.abs(tempX - x)) {
                y = tempY;
                x = tempX;
            }
        }

        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}
