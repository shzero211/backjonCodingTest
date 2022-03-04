package ���Ʈ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    �ð� ���⵵: O(n^2)
    ���� ���⵵: O(n^2)
    ����� �˰���: ��Ʈ��ŷ (DFS)
    ����� �ڷᱸ��: 2���� �迭
 */

public class ��Ʈ�ι̳�_14500 {

    private static int n, m, a[][], result;
    private static Boolean check[][];
    private static int dx[] = {0, 0, 1, -1};
    private static int dy[] = {-1, 1, 0, 0};

    private static int ex[][] = {{0, 0, 0, 1}, {0, 1, 2, 1}, {0, 0, 0, -1}, {0, -1, 0, 1}};
    private static int ey[][] = {{0, 1, 2, 1}, {0, 0, 0, 1}, {0, 1, 2, 1}, {0, 1, 1, 1}};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1. �Է�
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n+1][m+1];
        check = new Boolean[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                check[i][j] = false;
            }
        }

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 2. ���
        // 2. 2���� �迭 ������ ���ҿ��� �˻縦 �����մϴ�.
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                // 1) DFS �� �˻�

                // �湮�ߴ� ���� �� �湮�ؾ��ϱ� ������
                // ������ üũ�� ���ְ�, �������� üũ�� �������ݴϴ�.
                check[i][j] = true;

                dfs(i, j, a[i][j], 1);

                // üũ�� �����ϸ� ���ѷ����� �� ������ ������ �� �ֽ��ϴ�.
                // ���̷� ��͸� �ߴܽ�Ű�� ������, ����Ƚ���� 4 * 3 * 3, �������� �ִ� 36�� ����˴ϴ�.
                check[i][j] = false;

                // 2) �� ��� �˻�
                check_exshape(i, j);
            }
        }

        // 3. ���
        System.out.println(result);
    }

    public static int max(int a, int b){
        return a > b ? a: b;
    }

    // DFS �� 4���� ��� �˻� (�� ����)
    public static void dfs(int x, int y, int sum_value, int length){
        // ���̰� 4 �̻��̸� �������ݴϴ�.
        if(length >= 4){
            result = max(result, sum_value);
            return;
        }

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            // ���� �Ѿ�� ��� �˻�
            if(nx < 1 || nx > n || ny < 1 || ny > m) continue;

            // �湮���� ���� ���̸�
            if(check[nx][ny] == false) {

                // ������ üũ���ְ�
                check[nx][ny] = true;

                dfs(nx, ny, sum_value + a[nx][ny], length + 1);
                // �ϳ��� Ž���� �Ϸ��ϸ� ����� ���ƿɴϴ�.

                // ���ö� üũ�� �����մϴ�.
                check[nx][ny] = false;
            }
        }
    }

    // �� ��� �˻�
    public static void check_exshape(int x, int y){

        for(int i=0; i<4; i++){

            Boolean isOut = false;
            int sum_value = 0;

            for(int j=0; j<4; j++){
                int nx = x + ex[i][j];
                int ny = y + ey[i][j];

                if(nx < 1 || nx > n || ny < 1 || ny > m) {
                    isOut = true;
                    break;
                }
                else {
                    sum_value += a[nx][ny];
                }
            }
            if(!isOut) {
                result = max(result, sum_value);
            }
        }
        // ���� �迭�� ���� ���� ���س������� �Ʒ�ó�� �ۼ��� �� �ֽ��ϴ�.

//    int sum_value = 0;
//    // 1. ��
//    if(x>=1 && x+1<=n && y>=1 && y+2<=m){
//        sum_value = a[x][y] + a[x][y+1] + a[x][y+2] + a[x+1][y+1];
//        result = max(result, sum_value);
//    }
//
//    // 2. ��
//    if(x >= 1 && x+2 <=n && y>=1 && y+1<=m){
//        sum_value = a[x][y] + a[x+1][y] + a[x+2][y] + a[x+1][y+1];
//        result = max(result, sum_value);
//    }
//
//    // 3. ��
//    if(x-1 >= 1&& x <=n && y >=1 && y+2 <=m){
//        sum_value = a[x][y] + a[x][y+1] + a[x][y+2] + a[x-1][y+1];
//        result = max(result, sum_value);
//    }
//
//    // 4. ��
//    if(x-1 >= 1 && x+1 <=n && y >=1 && y+1 <=m){
//        sum_value = a[x][y] + a[x][y+1] + a[x-1][y+1] + a[x+1][y+1];
//        result = max(result, sum_value);
//    }
    }
}
