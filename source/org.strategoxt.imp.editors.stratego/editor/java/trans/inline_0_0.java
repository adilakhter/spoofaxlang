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

@SuppressWarnings("all") public class inline_0_0 extends Strategy 
{ 
  public static inline_0_0 instance = new inline_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("inline_0_0");
    Fail21308:
    { 
      TermReference i_4172 = new TermReference();
      IStrategoTerm j_4172 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21308;
      IStrategoTerm arg7621 = term.getSubterm(0);
      if(i_4172.value == null)
        i_4172.value = arg7621;
      else
        if(i_4172.value != arg7621 && !i_4172.value.match(arg7621))
          break Fail21308;
      if(arg7621.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)arg7621).getConstructor())
        break Fail21308;
      IStrategoTerm arg7622 = arg7621.getSubterm(0);
      IStrategoList annos670 = arg7622.getAnnotations();
      if(annos670.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos670).isEmpty())
        break Fail21308;
      IStrategoTerm arg7623 = ((IStrategoList)annos670).tail();
      if(arg7623.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7623).isEmpty())
        break Fail21308;
      j_4172 = term.getSubterm(1);
      term = j_4172;
      lifted6456 lifted64560 = new lifted6456();
      lifted64560.i_4172 = i_4172;
      term = topdown_1_0.instance.invoke(context, term, lifted64560);
      if(term == null)
        break Fail21308;
      lifted6458 lifted64580 = new lifted6458();
      lifted64580.i_4172 = i_4172;
      term = delete_elements_1_0.instance.invoke(context, term, lifted64580);
      if(term == null)
        break Fail21308;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}