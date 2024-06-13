const Post = ({post, setPostID}) => {
    return <div className={`col-4`} onClick={() => setPostID(post.id)}>
        <div className={`card p-3 single-post`}>
            <div>ID: {post.id}</div>
            <h4>Title: {post.title}</h4>
            <p>Author: {post.author}</p>
        </div>
    </div>
}

export default Post;