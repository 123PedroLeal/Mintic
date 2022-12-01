BEGIN
    DELETE FROM CLIENT WHERE ID = :id;
    :status_code:= 204;
END;