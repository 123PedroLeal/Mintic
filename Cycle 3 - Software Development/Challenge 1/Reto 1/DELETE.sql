BEGIN
    DELETE FROM CLOUD
    WHERE ID = :id;
    :status_code := 204; 
END;