package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServerController {

    @RequestMapping(value = "server/stores", method = RequestMethod.GET)
    public String getStores() {
        return "[\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Park Row at Beekman St\",\n" +
                "      \"address\": \"38 Park Row\",\n" +
                "      \"city\": \"New York\",\n" +
                "      \"openingHours\": \"10:00 - 14:00 and 17:00 - 20:30\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"Store Alcalá\",\n" +
                "      \"address\": \"Calle de Alcalá, 21\",\n" +
                "      \"city\": \"Madrid\",\n" +
                "      \"openingHours\": \"10:00 - 14:00 and 17:00 - 20:30\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "      \"name\": \"Chambers and West Broadway\",\n" +
                "      \"address\": \"125 Chambers Street\",\n" +
                "      \"city\": \"New York\",\n" +
                "      \"openingHours\": \"10:00 - 14:00 and 17:00 - 20:30\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"name\": \"Covent Garden - Russell St\",\n" +
                "      \"address\": \"10 Russell Street\",\n" +
                "      \"city\": \"London\",\n" +
                "      \"openingHours\": \"10:00 - 14:00 and 17:00 - 20:30\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 5,\n" +
                "      \"name\": \"Monmouth St\",\n" +
                "      \"address\": \"11 Monmouth Street\",\n" +
                "      \"city\": \"London\",\n" +
                "      \"openingHours\": \"10:00 - 14:00 and 17:00 - 20:30\"\n" +
                "    }\n" +
                "  ]";
    }

    @RequestMapping(value = "server/categories", method = RequestMethod.GET)
    public String getCategories() {
        return "[\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Books\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"Electronics\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "      \"name\": \"Computers\"\n" +
                "    }\n" +
                "  ]";
    }
    @RequestMapping(value = "server/productos", method = RequestMethod.GET)
    public String getProducts() {
        return "[\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Essential TypeScript 4: From Beginner to Pro\",\n" +
                "      \"price\": 45,\n" +
                "      \"description\": \"Learn the essentials and more of TypeScript, a popular superset of the JavaScript language that adds support for static typing. TypeScript combines the typing features of C# or Java.\",\n" +
                "      \"categoryId\": 1,\n" +
                "      \"stock\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"Hackeando el cerebro de tus compradores: PsychoGrowth\",\n" +
                "      \"price\": 5,\n" +
                "      \"description\": \"En Hackeando del cerebro de tus compradores, Corti nos revela cómo muchas compañías crean productos digitales o procesos de venta capaces de conectar con la psicología del comprador.\",\n" +
                "      \"categoryId\": 1,\n" +
                "      \"stock\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "      \"name\": \"Angular Routing: Learn To Create client-side and SPA with Routing and Navigation\",\n" +
                "      \"price\": 17,\n" +
                "      \"description\": \"In this book, the reader will be able to focus on one concept of Angular in deep.\",\n" +
                "      \"categoryId\": 1,\n" +
                "      \"stock\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"name\": \"SanDisk 128GB Ultra MicroSDXC UHS-I Memory Card with Adapter\",\n" +
                "      \"price\": 19,\n" +
                "      \"description\": \"Ideal for Android smartphones and tablets, and MIL cameras. SanDisk Memory Zone app for easy file management (Download and Installation Required).\",\n" +
                "      \"categoryId\": 2,\n" +
                "      \"stock\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 5,\n" +
                "      \"name\": \"GoPro HERO9 Black - Waterproof Action Camera with Front LCD\",\n" +
                "      \"price\": 399,\n" +
                "      \"description\": \"5K Video - Shoot stunning video with up to 5K resolution, perfect for maintaining detail even when zooming in\",\n" +
                "      \"categoryId\": 2,\n" +
                "      \"stock\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 6,\n" +
                "      \"name\": \"CL3 Rated High-Speed 4K HDMI Cable - 6 Feet\",\n" +
                "      \"price\": 7,\n" +
                "      \"description\": \"HDMI A Male to A Male Cable: Supports Ethernet, 3D, 4K video and Audio Return Channel (ARC)\",\n" +
                "      \"categoryId\": 2,\n" +
                "      \"stock\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 7,\n" +
                "      \"name\": \"Logitech MK270 Wireless Keyboard and Mouse Combo\",\n" +
                "      \"price\": 32,\n" +
                "      \"description\": \"The USB receiver is conveniently located in the box, top flap. This wireless keyboard and mouse feature Logitech Advanced 2.4GHz technology with a range of up to 10 metres.\",\n" +
                "      \"categoryId\": 3,\n" +
                "      \"stock\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 8,\n" +
                "      \"name\": \"External CD Drive USB 3.0 Portable CD DVD +/-RW Drive DVD/CD ROM\",\n" +
                "      \"price\": 20,\n" +
                "      \"description\": \"Plug & play. Easy to use,powered by USB port. No external driver and Power needed. Just plug it into your USB port and the DVD driver will be detected\",\n" +
                "      \"categoryId\": 3,\n" +
                "      \"stock\": 10\n" +
                "    }\n" +
                "  ]";
    }
    @RequestMapping(value = "server/orders", method = RequestMethod.GET)
    public String getOrders() {
        return "[\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"Dominicode\",\n" +
                "      \"date\": \"01/12/1995\",\n" +
                "      \"shippingAddress\": \"Av. de la Granvia de Hospitalet, 115\",\n" +
                "      \"city\": \"Barcelona\",\n" +
                "      \"pickup\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"detailsOrders\": [\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"orderId\": 1,\n" +
                "      \"quantity\": 10,\n" +
                "      \"productName\": \"Product name\"\n" +
                "    }\n" +
                "  ]";
    }

    @RequestMapping(value = "server/detailsOrdes", method = RequestMethod.GET)
    public String getDetailOrders() {
        return "[]";
    }
}
