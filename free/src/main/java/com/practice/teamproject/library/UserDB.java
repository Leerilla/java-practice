package com.practice.teamproject.library;

public class UserDB {

    String url = "jdbc:mysql://localhost:3306/데이터베이스명";
    String userName = "사용자명";
    String password = "비밀번호";

        try {
        // 데이터베이스 연결
        Connection connection = DriverManager.getConnection(url, userName, password);

        // Statement 객체 생성
        Statement statement = connection.createStatement();

        // SQL 명령 실행
        String sql = "INSERT INTO users (name, age) VALUES ('홍길동', 25), ('이순신', 35), ('강감찬', 45)";
        int rowsAffected = statement.executeUpdate(sql);

        // 결과 출력
        System.out.println("변경된 행의 수: " + rowsAffected);

        // 자원 해제
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
