package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class documentation_comment_chars_0_0 extends Strategy 
{ 
  public static documentation_comment_chars_0_0 instance = new documentation_comment_chars_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("documentation_comment_chars_0_0");
    Fail22883:
    { 
      IStrategoTerm p_4626 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22883;
      IStrategoTerm arg8029 = ((IStrategoList)term).head();
      if(arg8029.getTermType() != IStrategoTerm.INT || 42 != ((IStrategoInt)arg8029).intValue())
        break Fail22883;
      p_4626 = ((IStrategoList)term).tail();
      term = ltrim_1_0.instance.invoke(context, p_4626, lifted6868.instance);
      if(term == null)
        break Fail22883;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}