db.createUser(
    {
        user: "ms",
        pwd: "pass123",
        roles: [
            {
                role: "readWrite",
                db: "product-service"
            }
        ]
    }
);