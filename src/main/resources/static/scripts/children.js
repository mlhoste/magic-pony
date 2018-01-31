$(document).ready(function() {
    $('#modalButtonCancel').click(function() {
        $('#deleteChildModal').modal('hide');
    });

    $('#childrenMenuItem').addClass('active');
    $('#childrenMenuItem').siblings('li').removeClass('active');

    $('#birthDateRow').hide();

    $('#childrenTable').dataTable( {
        "language": {
            "url": "//cdn.datatables.net/plug-ins/1.10.15/i18n/French.json"
        },
        "columnDefs": [ {
            "targets": 3,
            "orderable": false
            } ]
    } );

    $('.confirm-delete').on('click', function(e) {
        e.preventDefault();

        var id = $(this).data('id');
        $('#deleteModal').data('id', id).modal('show');
    });

    $('#modalButtonRemove').click(function() {
        var id = $('#deleteModal').data('id');
        $.post("/enfant/delete/" + id );
        $('#deleteModal').modal('hide');
    });
} );