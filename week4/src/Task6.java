/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
解题思路：
   1.如果当前字符为左括号（{ [，就把当前字符入栈
   2.如果当前字符为右括号，取出栈顶元素，看看栈顶元素和括号类型是否匹配
     a）如果匹配，就把栈顶元素出栈，继续取下一个字符
     b）如果类型不匹配，就说明非法
 */
import java.util.Scanner;
import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入只包含 '('，')'，'{'，'}'，'['，']' 的字符串 s");
        String s = in.nextLine();
        boolean str = Matching(s);
        System.out.println("结果："+str);
    }
    public static boolean Matching(String s)
    {
        //先建立栈
        Stack<Character> stack = new Stack<>();
        //遍历每个元素
        for (int i=0;i<s.length();i++)
        {
            char str = s.charAt(i);
            //符合相应匹配则入栈
            if(str=='['|| str=='{' || str=='(')
            {
                stack.push(str);
                continue;
            }
            //取栈顶元素
            char top = stack.pop();
            if (top == '(' && str == ')')
            {
                continue;
            }
            if (top == '{' && str == '}')
            {
                continue;
            }
            if (top == '[' && str == ']')
            {
                continue;
            }
            return false;
        }
        return true;
    }
}
