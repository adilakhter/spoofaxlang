package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6908 extends Strategy 
{ 
  public static final lifted6908 instance = new lifted6908();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24002:
    { 
      IStrategoTerm x_4803 = null;
      term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{term});
      term = try_1_0.instance.invoke(context, term, declare_bodies_0_0.instance);
      if(term == null)
        break Fail24002;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail24002;
      x_4803 = term.getSubterm(0);
      term = x_4803;
      if(true)
        return term;
    }
    return null;
  }
}