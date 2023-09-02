package 중첩클래스;

public class Button {
        OnClickListener listener; // 생성된 객체의 주소 대입

        // 매개 변수의 다형성으로 외부에서 생성된 객체의 주소를 전달 받음
        void setOnClickListener(OnClickListener listener) {
            this.listener = listener;
        }

        void touch() {
            listener.onClick();  // 구현 객체의 onClick() 메소드 호출
        }
        // 클래스 내부에서 인터페이스를 만듬 (중첩 인터페이스)
        interface OnClickListener {
            void onClick();
        }
}

// 구현 클래스: 전화
class CallListener implements Button.OnClickListener {  // 버튼 클래스 내부의 리스너 인터페이스 상속
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
// 구현 클래스: 문자
class MessageListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}



// 실행 부분
class ButtonEx {
    public static void main(String[]args) {
        // 버튼 이벤트 처리
        Button btn = new Button(); // 하나의 버튼 객체를 생성하고 리스너 등록에 따라사 다른 이벤트 처리
        btn.setOnClickListener(new CallListener()); // setOnClickListener에서 매개변수를 선언
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
