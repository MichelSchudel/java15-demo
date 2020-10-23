package nl.craftsmen.java15demo;


import org.junit.jupiter.api.Test;

public class TextBlocksDemo {

    String html = """
                    <html>
                       <body>
                          <p class="title">Hello, Craftsmen</p>
                      </body>
                    </html>
                  """;

    @Test
    public void textBlocks() {
        System.out.println("----start------");
        System.out.println(html);
        System.out.println("----end--------");
    }

}
