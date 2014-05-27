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

@SuppressWarnings("all") public class is_endangered_name_0_2 extends Strategy 
{ 
  public static is_endangered_name_0_2 instance = new is_endangered_name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_4188, IStrategoTerm i_4188)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_endangered_name_0_2");
    Fail21379:
    { 
      IStrategoTerm j_4188 = null;
      j_4188 = term;
      term = strip_annos_0_0.instance.invoke(context, j_4188);
      if(term == null)
        break Fail21379;
      IStrategoTerm term11503 = term;
      Success11469:
      { 
        Fail21380:
        { 
          IStrategoTerm m_4188 = null;
          m_4188 = term;
          term = termFactory.annotateTerm(h_4188, checkListAnnos(termFactory, trans.constNil3));
          term = equal_0_1.instance.invoke(context, m_4188, term);
          if(term == null)
            break Fail21380;
          if(true)
            break Success11469;
        }
        term = term11503;
        IStrategoTerm o_4188 = null;
        o_4188 = term;
        term = termFactory.annotateTerm(i_4188, checkListAnnos(termFactory, trans.constNil3));
        term = equal_0_1.instance.invoke(context, o_4188, term);
        if(term == null)
          break Fail21379;
      }
      term = j_4188;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}