<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<link href="<c:url value='/css/maple.css'/>" type="text/css" rel=stylesheet></link>
</head>
<BODY topMargin=0 rightMargin=0 marginwidth="0" marginheight="0">
	<TABLE height=91 cellSpacing=0 cellPadding=0 width=984
		background=<c:url value='/picture/topbk.jpg'/> border=0>
		<TBODY>
			<TR>
				<TD width=733 background=<c:url value='/picture/header.jpg'/>></TD>
				<TD><FONT style="FONT-SIZE: x-small" color=#fffaed><BR>
					<BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<FONT
						color=#804060>当前用户：root </font> </FONT></TD>
			</TR>
		</TBODY>
	</TABLE>
	<TABLE cellSpacing=0 cellPadding=0 width=984 height="120%" border=0 background=<c:url value='/picture/bk3.jpg'/>>
		<TBODY>
			<TR>
				<TD vAlign=top width="12%">
					<TABLE cellSpacing=0 cellPadding=0 width=104 border=0>
						<TBODY>
							<TR>
								<TD valign=middle align="center"><BR>
								<FONT color=#804060>--系统菜单--</FONT>
								</TD>
							</TR>
							<TR>
								<TD id=left1001 style="CURSOR:hand" valign="middle"
									align="center" background=<c:url value="/picture/img01.jpg"/>
									height=28><FONT color=#804020>收货管理</FONT></TD>
							</TR>
							<TR>
								<TD valign=middle align="center">
									<DIV id=shouhuo>
										<A target="content" id="left1002" href="<c:url value='/jsps/store/store.jsp'/>">[仓库管理]</A>
										<BR/> 
										<A target="content" id="left1002" href="<c:url value='/jsps/store/remain.jsp'/>">[库存管理]</A>
										<BR/> 
										<A id="left1003" target="content" href="<c:url value='/jsps/save/save.jsp'/>">[入库]</A>
										<BR/>
										<a target="content" href="<c:url value='/jsps/out/out.jsp'/>">[出库]</a>
										<br/>
										<a target="content" href="<c:url value='/jsps/his/his.jsp'/>">[历史记录]</a>
										<br/>
									</DIV>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
				<TD vAlign=top align=left width="88%">
					<iframe name="content" src="<c:url value='/picture/tyyw.bmp'/>" frameborder="0" width="100%" height="100%"></iframe>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>

