<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">
	<div class="row">
		<div class="col-md-8 offset-md-2">
			<h1 class="my-5 text-center">
				<i class="fas fa-images"></i> ${gallery.title}
			</h1>
			<p class="">${gallery.description}</p>
			<h4 class="">이미지 파일 목록</h4>
			<div id="carouselExampleIndicators"
				class="carousel slide carousel-fade" data-ride="carousel">
				<ol class="carousel-indicators">
					<c:forEach var="image" items="${gallery.list}" varStatus="status">
						<li data-target="#carouselExampleIndicators"
							data-slide-to="${status.index}"
							<c:if test="${status.first}">class="active"</c:if>></li>
					</c:forEach>
				</ol>


				<div class="carousel-inner" role="listbox">
					<c:forEach var="image" items="${gallery.list}" varStatus="status">
						<div
							class="carousel-item <c:if test='${status.first}'>active</c:if>">
							<div class="view">
								<img class="d-block w-100" src="../image/${image.imageId}">
								<div class="mask rgba-black-light"></div>
							</div>
						</div>
					</c:forEach>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
	</div>
</div>