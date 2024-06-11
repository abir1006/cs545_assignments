import Post from "./Post";

const Posts = () => {

    const posts = [
        {id: 111, title: "Happiness", author: "John" },
        {id: 112, title: "MIU", author: "Dean" },
        {id: 113, title: "Enjoy life", author: "Jasmine" },
    ]

    return <div>{ posts.map( post => {
        return <Post post={post} />
    })}</div>
}

export default Posts;