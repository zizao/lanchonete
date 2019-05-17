$(document).ready(function() {
	
	$("#pedir").click(function() {
		var nome = $("#nome").val();
		
		if (nome == "") {
			alert("O campo nome é obrigatório!");
		} else {
			var alface = $("#alface").val();
			var bacon = $("#bacon").val();
			var carne = $("#carne").val();
			var ovo = $("#ovo").val();
			var queijo = $("#queijo").val();
			
			if ((alface == 0) && (bacon == 0) && (carne == 0) && (ovo == 0) && (queijo == 0)) {
				alert("O lanche deve possuir pelo menos um item.");
			} else {
				$("#pedido").submit();
			}
		}
	})

})