/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holaServlet.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Camila Ugalde Derbez y Oscar Figueroa Monter
 * @version 1.0
 * @since 24/08/2017
 */
@WebServlet(name = "Home", urlPatterns = {"/Home"})
public class Home extends HttpServlet {

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
            
            /**
             * @param css para la animacion y la fuente de la letra
             */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Un Servlet shido</title>"); 
            out.println("<style>");
            out.println("@-webkit-keyframes bounce {\n" +
"                    0% {\n" +
"                transform: scale(1,1) translate(0px, 0px);\n" +
"              }\n" +
"\n" +
"              30%{\n" +
"                transform: scale(1,0.8) translate(0px, 10px); \n" +
"              }\n" +
"\n" +
"              75%{\n" +
"                transform: scale(1,1.1) translate(0px, -25px); \n" +
"              }\n" +
"\n" +
"             100% {\n" +
"                transform: scale(1,1) translate(0px, 0px);\n" +
"              }\n" +
"            }\n" +
"\n" +
"            .bounce {\n" +
"                            width: 200px;\n" +
"                            height: 100px;\n" +
"                            background-color: transparent;\n" +
"                            font-size: 50px;\n" +
"                            color: bisque;\n" +
"                            border-color: bisque;\n" +
"                            border-radius: 50px;\n" +
"                            border-width: 10px;\n" +
                             "font-family: sans-serif;" +
                    "color: black;" +
"                 -webkit-animation: bounce 0.75s infinite;\n" +
"            }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body style='background-image:url(a.jpg)'>");
            //lo que dice la pagina
            out.println("<br><br><br><br><br><br><br><center><h1 class='bounce'>"+"Servlet Supremo"+ "</h1></center>");
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
