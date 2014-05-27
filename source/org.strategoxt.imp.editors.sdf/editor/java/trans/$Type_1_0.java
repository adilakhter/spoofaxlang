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

@SuppressWarnings("all") public class $Type_1_0 extends Strategy 
{ 
  public static $Type_1_0 instance = new $Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_92076)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Type_1_0");
    Fail76102:
    { 
      IStrategoTerm l_92265 = null;
      IStrategoTerm k_92265 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76102;
      k_92265 = term.getSubterm(0);
      IStrategoList annos2360 = term.getAnnotations();
      l_92265 = annos2360;
      term = c_92076.invoke(context, k_92265);
      if(term == null)
        break Fail76102;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_92265));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}