package com.example.dacs_3.ui.theme.main

import com.example.dacs_3.R
import com.example.dacs_3.model.Cooksnap
import com.example.dacs_3.model.Notification
import com.example.dacs_3.model.Recipe

fun generateFakeNotifications(): List<Notification> {
    return listOf(
        Notification(
            title = "Fun-Loving Cookpad Admin",
            content = "A warm welcome to Cookpad!! This is the largest cooking community in Vietnam 🇻🇳, with a massive collection of high-quality recipes ...",
            date = "26/04/2005",
            avatar = "https://www.example.com/avatar1.jpg"
        ),
        Notification(
            title = "New Recipe Alert!",
            content = "Check out the latest recipe for delicious Pho. It's a must-try for food lovers!",
            date = "27/04/2005",
            avatar = "https://www.example.com/avatar2.jpg"
        ),
        Notification(
            title = "Join Our Cooking Challenge",
            content = "Cook and share your favorite recipes in our monthly cooking challenge!",
            date = "28/04/2005",
            avatar = "https://www.example.com/avatar3.jpg"
        ),
        Notification(
            title = "Recipe of the Day",
            content = "Today's recipe is a healthy smoothie bowl. Perfect for your morning boost!",
            date = "29/04/2005",
            avatar = "https://www.example.com/avatar4.jpg"
        ),
        Notification(
            title = "Community Feedback",
            content = "We would love to hear your feedback! Let us know your thoughts on the new recipe features.",
            date = "30/04/2005",
            avatar = "https://www.example.com/avatar5.jpg"
        )
    )
}

fun generateFakeCooksnaps(): List<Cooksnap> {
    return listOf(
        Cooksnap(
            id = "1",
            recipeId = "r001",
            userName = "Quỳnh An",
            userAvatarResId = R.drawable.ic_launcher_background,  // Thay thế bằng tài nguyên thực tế
            imageResId = R.drawable.mockrecipeimage,               // Thay thế bằng tài nguyên thực tế
            description = "Thành phẩm lần đầu làm onigiri!",
            likes = 5,
            smiles = 3,
            claps = 2,
            createdAt = System.currentTimeMillis()
        ),
        Cooksnap(
            id = "2",
            recipeId = "r001",
            userName = "Quỳnh Anh",
            userAvatarResId = R.drawable.ic_launcher_background,  // Thay thế bằng tài nguyên thực tế
            imageResId = R.drawable.mockrecipeimage,               // Thay thế bằng tài nguyên thực tế
            description = "Ngon tuyệt vời, cả nhà đều thích!",
            likes = 8,
            smiles = 5,
            claps = 7,
            createdAt = System.currentTimeMillis()
        ),
        Cooksnap(
            id = "3",
            recipeId = "r001",
            userName = "Quỳnh Chi",
            userAvatarResId = R.drawable.ic_launcher_background,  // Thay thế bằng tài nguyên thực tế
            imageResId = R.drawable.mockrecipeimage,               // Thay thế bằng tài nguyên thực tế
            description = "Thêm trứng cá hồi ăn siêu ngon!",
            likes = 10,
            smiles = 4,
            claps = 9,
            createdAt = System.currentTimeMillis()
        ),
        Cooksnap(
            id = "4",
            recipeId = "r001",
            userName = "Quỳnh Mai",
            userAvatarResId = R.drawable.ic_launcher_background,  // Thay thế bằng tài nguyên thực tế
            imageResId = R.drawable.mockrecipeimage,               // Thay thế bằng tài nguyên thực tế
            description = "Làm nhanh gọn lẹ cho bữa sáng!",
            likes = 3,
            smiles = 1,
            claps = 2,
            createdAt = System.currentTimeMillis()
        )
    )
}

fun generateFakeKitchen(): List<Recipe> {
    return listOf(
        Recipe(
            title = "Cơm chiên Dương Châu",
            resultImages = "https://www.example.com/image1.jpg", // Thay thế bằng đường dẫn hình ảnh thực tế
            likes = 150,
            smiles = 75,
            claps = 20
        ),
        Recipe(
            title = "Bánh mì kẹp thịt nướng",
            resultImages = "https://www.example.com/image2.jpg", // Thay thế bằng đường dẫn hình ảnh thực tế
            likes = 200,
            smiles = 50,
            claps = 30
        ),
        Recipe(
            title = "Sushi cuộn trứng",
            resultImages = "https://www.example.com/image3.jpg", // Thay thế bằng đường dẫn hình ảnh thực tế
            likes = 250,
            smiles = 100,
            claps = 40
        ),
        Recipe(
            title = "Mì Ý sốt bò bằm",
            resultImages = "https://www.example.com/image4.jpg", // Thay thế bằng đường dẫn hình ảnh thực tế
            likes = 180,
            smiles = 80,
            claps = 25
        ),
        Recipe(
            title = "Gà rán giòn",
            resultImages = "https://www.example.com/image5.jpg", // Thay thế bằng đường dẫn hình ảnh thực tế
            likes = 300,
            smiles = 120,
            claps = 60
        )
    )
}

