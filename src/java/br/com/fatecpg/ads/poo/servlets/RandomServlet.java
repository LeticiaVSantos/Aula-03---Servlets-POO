/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a
 */
@WebServlet(name = "RandomServlet", urlPatterns = {"/random.php"})
public class RandomServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Aula 03: Servlets</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Aula 03: Servlets</h1>");
            out.println("<hr/>");
            out.println("<h2>Números aleatórios</h2>");
            out.println("<form>");
            out.println("Quantidade: <input type='text' name='n' />");
            out.println("<input type='submit' value='Gerar' />");
            out.println("</form>");
            out.println("<hr/>");
            try{
               int n = Integer.parseInt(request.getParameter("n"));
               
               out.println("<table border='1'>");
               out.println("<tr><th>Índice</th><th>Número</th></tr>");
               
            for(int i=1; i <=n; i++){
                
                int v = (int) (Math.random()*1000);
                out.println("<tr><th>"+i+"</th><th>"+v+"</th></tr>");
            }
                out.println("</table>");
                
            }catch(Exception ex){
                
                out.println("Entrar com um valor válido acima."); 
            }
            out.println("<h3><a href='home.html'>Voltar</a></h3>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

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

}
