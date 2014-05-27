package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9211 extends Strategy 
{ 
  TermReference o_4254;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28837:
    { 
      IStrategoTerm term10225 = term;
      IStrategoConstructor cons355 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11380:
      { 
        if(cons355 == SpoofaxGenerator._consImport_1)
        { 
          Fail28838:
          { 
            if(o_4254.value == null)
              o_4254.value = term.getSubterm(0);
            else
              if(o_4254.value != term.getSubterm(0) && !o_4254.value.match(term.getSubterm(0)))
                break Fail28838;
            if(true)
              break Success11380;
          }
          term = term10225;
        }
        if(cons355 == SpoofaxGenerator._consImportRenamed_2)
        { 
          if(o_4254.value == null)
            o_4254.value = term.getSubterm(0);
          else
            if(o_4254.value != term.getSubterm(0) && !o_4254.value.match(term.getSubterm(0)))
              break Fail28837;
        }
        else
        { 
          break Fail28837;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}