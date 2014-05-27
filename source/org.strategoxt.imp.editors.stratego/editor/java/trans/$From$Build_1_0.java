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

@SuppressWarnings("all") public class $From$Build_1_0 extends Strategy 
{ 
  public static $From$Build_1_0 instance = new $From$Build_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4274)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FromBuild_1_0");
    Fail21882:
    { 
      IStrategoTerm v_4499 = null;
      IStrategoTerm u_4499 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consFromBuild_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21882;
      u_4499 = term.getSubterm(0);
      IStrategoList annos693 = term.getAnnotations();
      v_4499 = annos693;
      term = b_4274.invoke(context, u_4499);
      if(term == null)
        break Fail21882;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consFromBuild_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_4499));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}