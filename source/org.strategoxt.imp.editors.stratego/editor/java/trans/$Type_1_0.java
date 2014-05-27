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

@SuppressWarnings("all") public class $Type_1_0 extends Strategy 
{ 
  public static $Type_1_0 instance = new $Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4274)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Type_1_0");
    Fail21881:
    { 
      IStrategoTerm s_4499 = null;
      IStrategoTerm r_4499 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21881;
      r_4499 = term.getSubterm(0);
      IStrategoList annos692 = term.getAnnotations();
      s_4499 = annos692;
      term = a_4274.invoke(context, r_4499);
      if(term == null)
        break Fail21881;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_4499));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}