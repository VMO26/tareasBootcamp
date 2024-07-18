create table if not exists METODO_PAGO (
METODO_ID INT primary key auto_increment,
NOMBRE_METODO VARCHAR(20) not null unique,
COMISION DECIMAL (4, 2) not null,
DESCRIPCION VARCHAR(255)
);

create table if not exists PERMISOS (
PERMISOS_ID INT primary key auto_increment,
TIPO_PERMISO VARCHAR(100) not null unique,
DESCRIPCION VARCHAR (255),
NIVEL_ACCESO INT not null
-- OTROS ATRIBUTOS
);

create table if not exists UBICACIONES (
UBICACIONES_ID INT primary key auto_increment,
CALLE VARCHAR(255) not null,
NUMERO INT not null,
COMUNA VARCHAR(255) not null,
REGION VARCHAR(255) not null,
DESCRIPCION TEXT
);

create table if not exists USERS (
USERS_ID INT primary key auto_increment,
ALIAS VARCHAR(50) not null unique,
CONTRASENA VARCHAR (20) not null, -- SE DEBE ENCRIPTAR CON JS O JAVA
CORREO VARCHAR(50) not null unique,
CREACION TIMESTAMP default CURRENT_TIMESTAMP,
UBICACION INT not null, -- SE PUEDE USAR DATO TIPO POINT Y LUEGO INDEXAR (INVESTIGAR MÁS)
ROL INT not null,
METODO_PAGO INT not null,
foreign key (UBICACION) references UBICACIONES(UBICACIONES_ID),
foreign key (ROL) references PERMISOS(PERMISOS_ID),
foreign key (METODO_PAGO) references METODO_PAGO(METODO_ID)
);

create table if not exists DESCUENTOS (
DESCUENTOS_ID INT primary key auto_increment,
PORCENTAJE_DESCUENTO DECIMAL (4, 2) not null,
DESCRIPCION TEXT
);

create table if not exists PEDIDOS (
PEDIDOS_ID INT primary key auto_increment,
USUARIO INT not null, 
ITEMS_PEDIDO INT not null,
ENVIO INT not null, 
TOTAL_VENTA INT not null, -- DISTINTO DE CERO
IMPUESTOS DECIMAL (4, 2) not null,
DESCUENTO INT,
TOTAL_BOLETA INT not null, -- DISTINTO DE CERO
foreign key (USUARIO) references USERS(USERS_ID),
foreign key (ENVIO) references UBICACIONES(UBICACIONES_ID),
foreign key (DESCUENTO) references DESCUENTOS(DESCUENTOS_ID)
);

create table if not exists CATEGORIAS (
CATEGORIAS_ID INT primary key auto_increment,
NOMBRE VARCHAR(50) not null unique,
DESCRIPCION TEXT
);

create table if not exists CALIFICACIONES (
CALIFICACIONES_ID INT primary key auto_increment,
PUNTUACION tinyint not null, -- RANGO 0 A 7
USUARIO INT not null,
ITEM INT not null,
RESEÑA TEXT not null,
foreign key (USUARIO) references USERS(USERS_ID)
);

create table if not exists PRODUCTOS (
PRODUCTOS_ID INT primary key auto_increment,
NOMBRE_PRODUCTO VARCHAR(255) not null unique,
CATEGORIA INT not null,
STOCK INT not null,
PRECIO INT not null, -- DISTINTO DE CERO
CALIFICACION INT,
IMAGENES TEXT, -- RUTA HACIA ARCHIVO/GALERIA
DESCUENTO INT not null, -- HEREDA; PARA not null DEFINIR PROMOCION 0% DE desc
DESCRIPCION TEXT,
foreign key (CATEGORIA) references CATEGORIAS(CATEGORIAS_ID),
foreign key (CALIFICACION) references CALIFICACIONES(CALIFICACIONES_ID),
foreign key (DESCUENTO) references DESCUENTOS(DESCUENTOS_ID)
);

ALTER TABLE CALIFICACIONES
ADD CONSTRAINT ITEM
FOREIGN KEY (ITEM) REFERENCES PRODUCTOS(PRODUCTOS_ID);









