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

@SuppressWarnings("all") final class lifted6723 extends Strategy 
{ 
  TermReference b_4725;

  TermReference c_4725;

  TermReference d_4725;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24218:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail24218;
      IStrategoTerm arg8054 = term.getSubterm(0);
      if(b_4725.value == null)
        b_4725.value = arg8054;
      else
        if(b_4725.value != arg8054 && !b_4725.value.match(arg8054))
          break Fail24218;
      IStrategoList annos692 = arg8054.getAnnotations();
      if(annos692.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos692).isEmpty())
        break Fail24218;
      if(c_4725.value == null)
        c_4725.value = ((IStrategoList)annos692).head();
      else
        if(c_4725.value != ((IStrategoList)annos692).head() && !c_4725.value.match(((IStrategoList)annos692).head()))
          break Fail24218;
      IStrategoTerm arg8055 = ((IStrategoList)annos692).tail();
      if(arg8055.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8055).isEmpty())
        break Fail24218;
      if(d_4725.value == null)
        d_4725.value = term;
      else
        if(d_4725.value != term && !d_4725.value.match(term))
          break Fail24218;
      if(true)
        return term;
    }
    return null;
  }
}