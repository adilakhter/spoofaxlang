package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_newer_0_0 extends Strategy 
{ 
  public static is_newer_0_0 instance = new is_newer_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_newer_0_0");
    Fail75681:
    { 
      IStrategoTerm c_92021 = null;
      IStrategoTerm d_92021 = null;
      IStrategoTerm e_92021 = null;
      IStrategoTerm f_92021 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail75681;
      c_92021 = term.getSubterm(0);
      d_92021 = term.getSubterm(1);
      e_92021 = term;
      term = file_exists_0_0.instance.invoke(context, c_92021);
      if(term == null)
        break Fail75681;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail75681;
      f_92021 = term;
      term = file_exists_0_0.instance.invoke(context, d_92021);
      if(term == null)
        break Fail75681;
      term = modification_time_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail75681;
      term = termFactory.makeTuple(f_92021, term);
      term = gt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail75681;
      term = e_92021;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}