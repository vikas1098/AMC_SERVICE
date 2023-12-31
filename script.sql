USE [master]
GO
/****** Object:  Database [service]    Script Date: 06/11/2020 16:08:32 ******/
CREATE DATABASE [service] ON  PRIMARY 
( NAME = N'service', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\service.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'service_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\service_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [service] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [service].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [service] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [service] SET ANSI_NULLS OFF
GO
ALTER DATABASE [service] SET ANSI_PADDING OFF
GO
ALTER DATABASE [service] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [service] SET ARITHABORT OFF
GO
ALTER DATABASE [service] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [service] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [service] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [service] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [service] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [service] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [service] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [service] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [service] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [service] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [service] SET  DISABLE_BROKER
GO
ALTER DATABASE [service] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [service] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [service] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [service] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [service] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [service] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [service] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [service] SET  READ_WRITE
GO
ALTER DATABASE [service] SET RECOVERY SIMPLE
GO
ALTER DATABASE [service] SET  MULTI_USER
GO
ALTER DATABASE [service] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [service] SET DB_CHAINING OFF
GO
USE [service]
GO
/****** Object:  Table [dbo].[tbservice]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbservice](
	[id] [numeric](18, 0) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[pincode] [numeric](18, 0) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[tbservice] ([id], [name], [pincode]) VALUES (CAST(1 AS Numeric(18, 0)), N'vikas1', CAST(124001 AS Numeric(18, 0)))
INSERT [dbo].[tbservice] ([id], [name], [pincode]) VALUES (CAST(2 AS Numeric(18, 0)), N'neha', CAST(124002 AS Numeric(18, 0)))
INSERT [dbo].[tbservice] ([id], [name], [pincode]) VALUES (CAST(1 AS Numeric(18, 0)), N'vikas1', CAST(124002 AS Numeric(18, 0)))
INSERT [dbo].[tbservice] ([id], [name], [pincode]) VALUES (CAST(7 AS Numeric(18, 0)), N'Kaushik', CAST(124003 AS Numeric(18, 0)))
/****** Object:  Table [dbo].[tbBrand]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbBrand](
	[brand] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Daikin')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Voltus')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Samsung')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'LG')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'BlueStar')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'O Genreal')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Hitachi')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Carrier')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Vesstar')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Media')
INSERT [dbo].[tbBrand] ([brand]) VALUES (N'Godraj')
/****** Object:  Table [dbo].[Problem2]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Problem2](
	[EmpID] [nvarchar](50) NOT NULL,
	[EmpName] [nvarchar](50) NOT NULL,
	[CustomerId] [nvarchar](50) NOT NULL,
	[ProblemId] [nvarchar](50) NOT NULL,
	[Status] [nvarchar](50) NOT NULL,
	[Reason] [nvarchar](500) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Problem2] ([EmpID], [EmpName], [CustomerId], [ProblemId], [Status], [Reason]) VALUES (N'1', N'vikas1', N'4', N'F284', N'Not Done', N'no able')
/****** Object:  Table [dbo].[problem]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[problem](
	[probId] [nvarchar](50) NOT NULL,
	[problem] [nvarchar](max) NOT NULL,
	[customerID] [nvarchar](50) NOT NULL,
	[pincode] [nvarchar](50) NOT NULL,
	[employeeID] [nvarchar](50) NOT NULL,
	[employeeName] [nvarchar](50) NOT NULL,
	[Status] [nvarchar](50) NULL,
 CONSTRAINT [PK_problem] PRIMARY KEY CLUSTERED 
(
	[probId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[problem] ([probId], [problem], [customerID], [pincode], [employeeID], [employeeName], [Status]) VALUES (N'286q', N'service my ac', N'1', N'124001', N'1', N'vikas1', N'Done')
INSERT [dbo].[problem] ([probId], [problem], [customerID], [pincode], [employeeID], [employeeName], [Status]) VALUES (N'28q8', N'service my ac', N'5', N'124001', N'2', N'neha', N'Not Done')
INSERT [dbo].[problem] ([probId], [problem], [customerID], [pincode], [employeeID], [employeeName], [Status]) VALUES (N'6F22', N'service my ac', N'2', N'124002', N'1', N'vikas1', N'Done')
INSERT [dbo].[problem] ([probId], [problem], [customerID], [pincode], [employeeID], [employeeName], [Status]) VALUES (N'F284', N'service my ac', N'3', N'124001', N'1', N'vikas1', N'Not Done')
INSERT [dbo].[problem] ([probId], [problem], [customerID], [pincode], [employeeID], [employeeName], [Status]) VALUES (N'Fq6q', N'service my ac', N'4', N'124002', N'1', N'vikas1', N'not done')
INSERT [dbo].[problem] ([probId], [problem], [customerID], [pincode], [employeeID], [employeeName], [Status]) VALUES (N'q648', N'abfhfmf gkbjg gjk kg vj hjg gkjb g gjkvhv fgjnvh fgkjhvtrkg
kjfjikjvi', N'5', N'124001', N'1', N'vikas1', N'Done')
/****** Object:  Table [dbo].[permission]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[permission](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nchar](10) NULL,
	[services] [int] NOT NULL,
	[employee] [int] NOT NULL,
	[customer] [int] NOT NULL,
	[machine] [int] NOT NULL,
	[card] [int] NOT NULL,
	[login] [int] NOT NULL,
	[emp] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[machine_type]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[machine_type](
	[machine_type] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'Window')
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'Wall mounted Split')
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'Ductable Split')
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'Casstte Split')
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'HAT')
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'VRF')
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'VRV')
INSERT [dbo].[machine_type] ([machine_type]) VALUES (N'Concealed Split')
/****** Object:  Table [dbo].[machine]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[machine](
	[id] [int] NOT NULL,
	[brand] [nvarchar](50) NOT NULL,
	[capacity] [float] NOT NULL,
	[location] [nvarchar](50) NOT NULL,
	[machine_type] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_machine] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[machine] ([id], [brand], [capacity], [location], [machine_type]) VALUES (5, N'Voltus', 1.5, N'Manager Cabin ', N'Ductable Split')
/****** Object:  Table [dbo].[login]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[login](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[login] ON
INSERT [dbo].[login] ([Id], [username], [password]) VALUES (1, N'vikas1', N'1234')
INSERT [dbo].[login] ([Id], [username], [password]) VALUES (2, N'neha', N'1234')
INSERT [dbo].[login] ([Id], [username], [password]) VALUES (3, N'sarita', N'1234')
INSERT [dbo].[login] ([Id], [username], [password]) VALUES (4, N'komal', N'1234')
INSERT [dbo].[login] ([Id], [username], [password]) VALUES (5, N'satya', N'1234')
INSERT [dbo].[login] ([Id], [username], [password]) VALUES (7, N'Kaushik', N'1234')
SET IDENTITY_INSERT [dbo].[login] OFF
/****** Object:  Table [dbo].[location]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[location](
	[location] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[location] ([location]) VALUES (N'Hall')
INSERT [dbo].[location] ([location]) VALUES (N'Bedroom')
INSERT [dbo].[location] ([location]) VALUES (N'Manager Cabin ')
INSERT [dbo].[location] ([location]) VALUES (N'ATM ')
INSERT [dbo].[location] ([location]) VALUES (N'Open area Left ')
INSERT [dbo].[location] ([location]) VALUES (N'Open area Right')
INSERT [dbo].[location] ([location]) VALUES (N'Drawing room')
INSERT [dbo].[location] ([location]) VALUES (N'MD Cabin')
INSERT [dbo].[location] ([location]) VALUES (N'Director Room')
/****** Object:  Table [dbo].[employee]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee](
	[eid] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[datejoin] [nvarchar](50) NOT NULL,
	[datebirth] [nvarchar](50) NOT NULL,
	[address] [nvarchar](500) NOT NULL,
	[ahare] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[phone] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[employee] ON
INSERT [dbo].[employee] ([eid], [name], [datejoin], [datebirth], [address], [ahare], [email], [phone]) VALUES (1, N'vikas', N'12-10-2018', N'10-10-1998', N'new vijay nagar', N'1494895858', N'vikas10@gmail.com', N'7056102457')
INSERT [dbo].[employee] ([eid], [name], [datejoin], [datebirth], [address], [ahare], [email], [phone]) VALUES (2, N'neha', N'19-08-2018', N'01-01-1999', N'janta colony ', N'1234567890', N'jindal@gmail.com', N'8976084787')
INSERT [dbo].[employee] ([eid], [name], [datejoin], [datebirth], [address], [ahare], [email], [phone]) VALUES (3, N'sarita', N'12-05-2016', N'30-08-1996', N'shakti vihar', N'0987654321', N'sarita@gmail.com', N'8907689065')
INSERT [dbo].[employee] ([eid], [name], [datejoin], [datebirth], [address], [ahare], [email], [phone]) VALUES (4, N'komal', N'30-05-2019', N'08-10-2001', N'ekta colony', N'8907654321', N'komal@gmail.com', N'8909754212')
INSERT [dbo].[employee] ([eid], [name], [datejoin], [datebirth], [address], [ahare], [email], [phone]) VALUES (5, N'satya', N'01-02-2015', N'12-10-1971', N'jagdesh nagar', N'1234567890', N'satya@gmail.com', N'7980645277')
INSERT [dbo].[employee] ([eid], [name], [datejoin], [datebirth], [address], [ahare], [email], [phone]) VALUES (7, N'Kaushik', N'01-08-2017', N'12-12-1996', N'jhang colony', N'1236547809', N'kaushik@gmail.com', N'0987656788')
SET IDENTITY_INSERT [dbo].[employee] OFF
/****** Object:  Table [dbo].[customer]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[customer](
	[code] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[phone] [numeric](18, 0) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[area] [nvarchar](50) NOT NULL,
	[city] [nvarchar](50) NOT NULL,
	[amcfrom] [nvarchar](50) NULL,
	[amcto] [nvarchar](50) NULL,
	[citycode] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[customer] ON
INSERT [dbo].[customer] ([code], [name], [phone], [email], [area], [city], [amcfrom], [amcto], [citycode]) VALUES (1, N'Narender', CAST(7056102457 AS Numeric(18, 0)), N'narender@gmail.com', N'New vijay nagar', N'Rohtak', N'18-09-2019', N'18-09-2020', N'124001')
INSERT [dbo].[customer] ([code], [name], [phone], [email], [area], [city], [amcfrom], [amcto], [citycode]) VALUES (2, N'neha', CAST(9034932769 AS Numeric(18, 0)), N'neha@gmail.com', N'shiv nagar	', N'sonipat', N'10-02-2020', N'10-02-2021', N'124002')
INSERT [dbo].[customer] ([code], [name], [phone], [email], [area], [city], [amcfrom], [amcto], [citycode]) VALUES (3, N'VINIT', CAST(7090907612 AS Numeric(18, 0)), N'vinit@gmail.com', N'gnadi camp	', N'rohtak', N'12-05-2019', N'12-05-2020', N'124001')
INSERT [dbo].[customer] ([code], [name], [phone], [email], [area], [city], [amcfrom], [amcto], [citycode]) VALUES (4, N'komal', CAST(7897675643 AS Numeric(18, 0)), N'komal@gmail.com', N'shubhas colony	', N'sonipat', N'12-08-2017', N'12-08-2018', N'124002')
INSERT [dbo].[customer] ([code], [name], [phone], [email], [area], [city], [amcfrom], [amcto], [citycode]) VALUES (5, N'tara', CAST(8908978998 AS Numeric(18, 0)), N'tara@gmail.com', N'shaki nagar', N'rohtak', N'12-09-2019', N'12-09-2019', N'124001')
INSERT [dbo].[customer] ([code], [name], [phone], [email], [area], [city], [amcfrom], [amcto], [citycode]) VALUES (6, N'Devender', CAST(9098971268 AS Numeric(18, 0)), N'dev@gmail.com', N'ghronda nagar karnal', N'karnal', N'18-09-2018', N'18-09-2019', N'124003')
SET IDENTITY_INSERT [dbo].[customer] OFF
/****** Object:  Table [dbo].[capacity]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[capacity](
	[capacity] [float] NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[capacity] ([capacity]) VALUES (0.8)
INSERT [dbo].[capacity] ([capacity]) VALUES (1)
INSERT [dbo].[capacity] ([capacity]) VALUES (1.2)
INSERT [dbo].[capacity] ([capacity]) VALUES (1.5)
INSERT [dbo].[capacity] ([capacity]) VALUES (2)
INSERT [dbo].[capacity] ([capacity]) VALUES (2.2)
INSERT [dbo].[capacity] ([capacity]) VALUES (2.5)
INSERT [dbo].[capacity] ([capacity]) VALUES (3)
INSERT [dbo].[capacity] ([capacity]) VALUES (3.4)
INSERT [dbo].[capacity] ([capacity]) VALUES (4)
INSERT [dbo].[capacity] ([capacity]) VALUES (4.5)
INSERT [dbo].[capacity] ([capacity]) VALUES (5)
INSERT [dbo].[capacity] ([capacity]) VALUES (5.2)
INSERT [dbo].[capacity] ([capacity]) VALUES (5.5)
INSERT [dbo].[capacity] ([capacity]) VALUES (6)
INSERT [dbo].[capacity] ([capacity]) VALUES (7)
INSERT [dbo].[capacity] ([capacity]) VALUES (7.4)
/****** Object:  Table [dbo].[adminlog]    Script Date: 06/11/2020 16:08:33 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[adminlog](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[adminlog] ([username], [password]) VALUES (N'vikas', N'12345')
