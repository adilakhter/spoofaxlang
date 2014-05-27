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

@SuppressWarnings("all") public class $Entity_2_0 extends Strategy 
{ 
  public static $Entity_2_0 instance = new $Entity_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4273, Strategy x_4273)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Entity_2_0");
    Fail21879:
    { 
      IStrategoTerm j_4499 = null;
      IStrategoTerm h_4499 = null;
      IStrategoTerm i_4499 = null;
      IStrategoTerm k_4499 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21879;
      h_4499 = term.getSubterm(0);
      i_4499 = term.getSubterm(1);
      IStrategoList annos690 = term.getAnnotations();
      j_4499 = annos690;
      term = w_4273.invoke(context, h_4499);
      if(term == null)
        break Fail21879;
      k_4499 = term;
      term = x_4273.invoke(context, i_4499);
      if(term == null)
        break Fail21879;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{k_4499, term}), checkListAnnos(termFactory, j_4499));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}