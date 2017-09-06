/*
AUTOR: Juan Ignacio Monroy Gonzalez/J. Carlos Nevarez Tovar 5IM6
VERSIÓN: 1.0 
DESCRIPCIÓN: Clase que recibe el request y evia un HolaMundo
OBSERVACIONES: No tiene css
COMPILACIÓN: Se compila en tiempo de ejecucion. 
EJECUCIÓN: Se ejecuta desde NeatBeans (8.0 en adelante, usando GlashFish server) presionando la tecla F6
*/
package HolaMundo;

//Librerias
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <h3>Clase Hello</h3>
 * Recibe el request del index y devuelve un HolaMundo
 * @author Juan Ignacio Monroy Gonzalez
 * @version v1.0.1
 * @since 28/08/2017
 */
@WebServlet(name = "Hello", urlPatterns = {"/Hello"})
public class Hello extends HttpServlet {

    /**
     * Procesa requests para ambos HTTP <code>GET</code> and <code>POST</code>
     * métodos.
     *
     * @param request peticion del servlet
     * @param response repuesta del servlet 
     * @throws ServletException si ocurre un servlet-specific error
     * @throws IOException si ocurre un I/O error
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Codigo HTML del HolaMundo. Codigo de ejmplo. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Hello</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola mundo</h1>");
            out.println("</body>");
            out.println("</html>");
        }//Cierre del despligue de codigo HTML
    }//Cierre del método

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}//Fin de la clase
