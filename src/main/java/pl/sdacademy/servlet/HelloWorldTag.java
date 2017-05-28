package pl.sdacademy.servlet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class HelloWorldTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("Hello World!");
    }

}
